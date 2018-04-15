package example2

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    // Operations only for non-nulls
    val listWithNulls: List<String?> = listOf("A", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // will ignore nulls
        // e.x. person?.department?.company = corporate.getNumber() is ignored if person or person.department is null
    }
}