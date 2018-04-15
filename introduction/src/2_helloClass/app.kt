package `2_helloClass`

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    println(Hello().sayHello())
}

class Hello{
    fun sayHello() : String {
        return "Hello World"
    }
}