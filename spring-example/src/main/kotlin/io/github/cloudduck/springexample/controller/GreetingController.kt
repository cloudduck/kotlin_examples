package io.github.cloudduck.springexample.controller

import io.github.cloudduck.springexample.model.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by cloudduck on 1/28/2018.
 */
@RestController
class GreetingController {
    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

    @GetMapping("/greeting1")
    fun greeting1(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return Greeting(counter.incrementAndGet(), "Hello, $name").toString()
    }

    @GetMapping("/greeting2")
    fun greeting2(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return Greeting(counter.incrementAndGet(), "Hello, $name").greet()
    }
}