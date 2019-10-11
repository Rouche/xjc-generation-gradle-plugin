/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.edeandrea.xjcplugin.plugin

import com.github.edeandrea.xjcplugin.AbstractIntegrationTests
import org.assertj.core.api.Assertions.assertThat
import org.gradle.testkit.runner.TaskOutcome
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.io.File

internal class XjcPluginIntegrationTests : AbstractIntegrationTests() {
	internal data class Schema(val taskName: String, val sourceSetName: String = "main", val packageFolder: String, val schemaRootDir: String = "src/$sourceSetName/schemas/xjc")

	private val schemasList = listOf(
		Schema(
			taskName = "generateMaven2Schema",
			packageFolder = "com/github/edeandrea/xjcplugin/generated/maven2"
		),
		Schema(
			taskName = "generateMavenSchema",
			sourceSetName = "test",
			packageFolder = "com/github/edeandrea/xjcplugin/generated/maven"
		),
		Schema(
			taskName = "schemaGen_com-github-edeandrea-xjcplugin-generated-artifactory",
			packageFolder = "com/github/edeandrea/xjcplugin/generated/artifactory",
			schemaRootDir = "misc/resources/schemas/artifactory"
		)
	)

	private fun schemas() = schemasList

	@Test
	fun `xjcGeneration task works as expected`() {
		val buildResult = build("clean", "xjcGeneration")

		this.schemasList
			.map { it.taskName }
			.plus("xjcGeneration")
			.forEach { taskName ->
				assertThat(buildResult.task(":$taskName")?.outcome)
				.isNotNull()
				.isEqualTo(TaskOutcome.SUCCESS)
		}

		this.schemasList.forEach(this::verifySchema)
	}

	@ParameterizedTest(name = "{index} ==> XJC generation for schema {0} should be correct")
	@MethodSource("schemas")
	fun `XJC generation for task should produce the proper results`(schema: Schema) {
		val buildResult = build("clean", schema.taskName)

		assertThat(buildResult.task(":${schema.taskName}")?.outcome)
			.isNotNull()
			.isEqualTo(TaskOutcome.SUCCESS)

		assertThat(buildResult.task(":xjcGeneration")?.outcome)
			.isNull()

		verifySchema(schema)
	}

	private fun mapFilesByName(files: Collection<File>) = files.associateBy { it.name }

	private fun getSourceFileContents(file: File): String {
		var collectLine = false
		val lines = file.readLines().map { line ->
			if (!collectLine && line.startsWith("package ")) {
				collectLine = true
			}

			if (collectLine) line else null
		}.toMutableList()

		lines.removeAll { (it == null) || it.trim().isBlank() }
		return lines.joinToString(separator = "\n")
	}

	private fun areFilesAllEqual(actualFiles: List<File>, expectedFiles: List<File>): Boolean {
		val actualFilesMap = mapFilesByName(actualFiles)
		var allFilesEqual = true
		var expectedFileNotEqual: File? = null
		var actualFileNotEqual: File? = null

		for (file in expectedFiles) {
			val actualFile = actualFilesMap[file.name]

			if ((actualFile == null) || (getSourceFileContents(file) != getSourceFileContents(actualFile))) {
				allFilesEqual = false
				expectedFileNotEqual = file
				actualFileNotEqual = actualFile
				break
			}
		}

		if (!allFilesEqual) {
			println("Contents of expected file ${expectedFileNotEqual?.absolutePath} and actual file ${actualFileNotEqual?.absolutePath} aren't the same")
		}

		return allFilesEqual
	}

	private fun verifySchema(schema: Schema) {
		println("Verifying schema $schema")
		val expectedFilesDir = File("$testDir/expected/${schema.schemaRootDir}/${schema.packageFolder}")
		val actualSourceFilesDir = File("$testDir/build/generated-sources/${schema.sourceSetName}/xjc/${schema.packageFolder}")
		val expectedFiles = expectedFilesDir.walkTopDown().filter { it.isFile }.toList()
		val actualFiles = actualSourceFilesDir.walkTopDown().filter { it.isFile }.toList()

		assertThat(actualFiles).hasSameSizeAs(expectedFiles)
		assertThat(areFilesAllEqual(actualFiles, expectedFiles)).isTrue()
	}
}