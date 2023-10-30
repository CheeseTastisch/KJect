package me.kject.annotation

/**
 * Markes a function to be called when KJect disposes the class.
 *
 * If a [context] is provided, the function will only be called when KJect is launched in the given [context].
 * If [context] is "*" the function will be called in all contexts.
 *
 * Multiple [context]s can be defined by using the [Dispose] annotation multiple times.
 *
 * See [me.kject.KJect.call] for information on how calling functions works.
 */
@Repeatable
@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispose(val context: String = "*")
