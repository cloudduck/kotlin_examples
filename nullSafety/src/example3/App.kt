package example3

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    val b : String? = null
    // Elvis Operator
    val l: Int = b?.length ?: -1 // if of operation on left is not null it is returned, else return the right
}