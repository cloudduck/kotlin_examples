package example1

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    // Compile null safe
    var a: String = "Hello world"
    // a = null -- Cannot be done (Compile Error)
    val aLength = a.length

    var b: String? = "Hello World"
    b = null // Lets the String be null
    // val bLength = b.length -- cannot be done (Compile Error)

    // Checking for null
    // Option 1
    val bLength1 = if (b != null) b.length else -1
    // Option 2
    var bLength2 = -1
    if (b != null) {
        bLength2 = b.length
    }
    // Option 3
    val bLength3 = b?.length // if b is null, null is returned -- type is Int?
}