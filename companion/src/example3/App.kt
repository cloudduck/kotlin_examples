package example3

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    val instance1 = MyClass.create()
    // or
    val instance2 = MyClass.Companion
}

class MyClass {
    companion object {
        @JvmStatic // makes it so it is compiled as a static method
        fun create(): MyClass = MyClass()
    }
}
