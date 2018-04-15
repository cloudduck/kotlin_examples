package io.github.cloudduck.springexample.model

/**
 * Created by cloudduck on 1/28/2018.
 */
data class Greeting(val id: Long, val content: String) {
    fun greet(): String {
        return "Id: $id :: $content"
    }
}