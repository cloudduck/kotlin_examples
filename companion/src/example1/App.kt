package example1

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    val instance1 = MyClass.create()
    // or
    val instance2 = MyClass.Companion
}

class MyClass {
    // Looks like a static method, but compiled to be a another class
    companion object {
        fun create(): MyClass = MyClass()
    }
}
