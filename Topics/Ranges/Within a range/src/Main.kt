const val NUMBERS = 5

fun main() {
    // write your code here
    val (min1, max1, min2, max2, given) = MutableList(NUMBERS) { readLine()!!.toInt() }
    println(given in min1..max1 || given in min2..max2)
}
