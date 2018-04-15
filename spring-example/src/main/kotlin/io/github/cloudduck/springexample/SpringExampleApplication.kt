package io.github.cloudduck.springexample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringExampleApplication::class.java, *args)
}
