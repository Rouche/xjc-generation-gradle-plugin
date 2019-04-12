package com.github.edeandrea.xjcplugin.domain

import groovy.lang.Closure
import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project
import java.io.File

/**
 * An extension for holding the *xjcGeneration* DSL
 *
 * @property project The [Project]
 * @author Eric Deandrea
 */
open class XjcExtension(project: Project) {
	/**
	 * The default source set to use for all [schemas][Schema] if any individual [Schema] does not specify one. Defaults to **main**.
	 */
	var defaultSourceSet: String = "main"

	/**
	 * The default binding file to use for all [schemas][Schema] if any individual [Schema] does not specify one.
	 */
	var defaultBindingFile: File? = null

	/**
	 * The collection of [schemas][Schema]
	 */
	var schemas: NamedDomainObjectContainer<Schema> = project.container(Schema::class.java)

	/**
	 * Configuration of each [Schema]
	 */
	fun schemas(configureClosure: Closure<Schema>) = this.schemas.configure(configureClosure)
}

/**
 * Placeholder for a schema within the *xjcGeneration* DSL
 * @property name The name of the schema
 */
class Schema(val name: String) {
	/**
	 * The binding file to use
	 */
	var bindingFile: String? = null

	/**
	 * The description
	 */
	var description: String? = null

	/**
	 * The java package name
	 */
	var javaPackageName: String = ""

	/**
	 * The schema file to use
	 */
	lateinit var schemaFile: String

	/**
	 * The source set
	 */
	var sourceSet: String? = null

	/**
	 * The name of the task to generate
	 */
	var taskName: String? = null

	/**
	 * Override for setting the *schemaFile* as a [File]
	 * @param schemaFile The [File] reference to the *schemaFile*
	 */
	fun setSchemaFile(schemaFile: File) {
		this.schemaFile = schemaFile.absolutePath
	}

	/**
	 * Override for setting the *bindingFile* as a [File]
	 * @param bindingFile The [File] reference to the *bindingFile*
	 */
	fun setBindingFile(bindingFile: File) {
		this.bindingFile = bindingFile.absolutePath
	}
}