package example3

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    printFoo(A())
}

class A {
    fun foo() = "A"
}

fun A.foo(i: Int) = "A" + i // we can overload member functions

fun printFoo(a : A) {
    println("A foo = " + a.foo(2))
}