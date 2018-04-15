package example4

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    val b : String? = null
    // !! Operator
    val l = b!!.length // explicitly asks for a NPE
}