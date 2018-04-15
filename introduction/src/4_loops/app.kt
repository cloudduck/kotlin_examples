package `4_loops`

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    forLoop(args)
    whileLoop(args)
}

fun forLoop(args: Array<String>) {
    // Pass program arguments
    println("For loop:")
    for (arg in args) {
        println("Hello " + arg)
    }
}

fun whileLoop(args: Array<String>) {
    println("\nWhile loop:")
    val argsSize = args.size
    var index = 0
    while (index < argsSize) {
        println("Hello " + args[index])
        index++
    }
}