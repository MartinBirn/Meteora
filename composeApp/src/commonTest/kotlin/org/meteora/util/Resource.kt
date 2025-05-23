package org.meteora.util

/**
 * Provides access to resource on [path].
 *
 * The path should be relative to the project's directory, such as
 * `src/commonTest/resources/some/optional/folders/file.txt`.
 */
expect class Resource(path: String) {
    /**
     * Returns true when the resource exists, false when it doesn't.
     */
    fun exists(): Boolean

    /**
     * Returns the resource's content as a UTF-8 string.
     *
     * @throws FileReadException when the resource doesn't exist or can't be read.
     */
    fun readText(): String

    /**
     * Returns the resource's content as a byte array.
     *
     * @throws FileReadException when the resource doesn't exist or can't be read.
     */
    fun readBytes(): ByteArray
}
