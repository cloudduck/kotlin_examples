package example5

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    val a: Long? = null
    // Safe Casts
    val aInt: Int? = a as? Int // if cast fails, then it returns null
}