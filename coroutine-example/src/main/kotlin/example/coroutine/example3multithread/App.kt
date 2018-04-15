@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package example.coroutine.example3multithread

import kotlinx.coroutines.experimental.launch
import java.util.concurrent.atomic.AtomicInteger

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    val counter = AtomicInteger()
    for (i in 1..1_000_000) {
        // A million threads will be spun off -- BAD
        /*
        thread(start = true) {
            counter.getAndIncrement()
        }
        */
        // A million coroutines created but maybe not all million are completed before main thread completes
        launch {
            counter.getAndIncrement()
        }
    }
    println("Counter " + counter.get())
}