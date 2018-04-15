package example2

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    val instance1 = MyClass.create()
    // or
    val instance2 = MyClass.Companion
}

interface Factory<T> {
    fun create(): T
}

class MyClass {
    // Looks like a static method, but compiled to be a another class
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}