@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package example.coroutine.example1

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    println("Start")

    // Start a coroutine
    launch {
        // delay() can only be used in coroutines
        delay(1000) //Doesn't block the thread -- only suspends the coroutine
        println("Hello World")
    }

    Thread.sleep(2000) // If this is commented out, the thread will complete before the coroutine is done
    println("Stop")
}