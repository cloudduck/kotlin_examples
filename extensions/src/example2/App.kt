package example2

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    printFoo(A()) // member function wins if the same
}

class A {
    fun foo() = "A"
}

fun A.foo() = "A1"

fun printFoo(a : A) {
    println("A foo = " + a.foo())
}