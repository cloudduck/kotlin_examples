@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package example.coroutine.example4async

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    val deferred = (1..1_000_000).map { n ->
        async {
            delay(1000) // ensure all run in parallel
            n
        }
    }
    runBlocking {
        val sum = deferred.sumBy { it.await() }
        println("Counter $sum")
    }
}