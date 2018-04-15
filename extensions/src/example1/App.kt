package example1

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    printFoo(B()) // Prints class A's foo method because printFoo declared type is A
}

// Inner Classes
open class A

class B : A()

// Extension methods
fun A.foo() = "A"

fun B.foo() = "B"

// Static method
fun printFoo(a : A) {
    println("A foo = " + a.foo())
}