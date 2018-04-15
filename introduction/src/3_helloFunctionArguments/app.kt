package `3_helloFunctionArguments`

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    println(sayHello("World"))
}

fun sayHello(name: String): String {
    return "Hello " + name
}