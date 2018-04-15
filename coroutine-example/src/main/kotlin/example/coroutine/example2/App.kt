@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package example.coroutine.example2

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    println("Start")
    // runBlocking will sleep the main Thread -- main thread must wait for runBlocking to complete
    runBlocking {
        delay(2000)
        println("Hello World")
    }
    println("Stop")
}