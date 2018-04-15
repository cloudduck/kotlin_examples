package example6

/**
 * Created by cloudduck on 1/28/2018.
 */
fun main(args: Array<String>) {
    // Filter nulls from collection
    val nullList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullList.filterNotNull()
}