const val NUMBERS = 3

fun main() {
    // write your code here
    val (given, min, max) = MutableList(NUMBERS) { readLine()!!.toInt() }
    println(given in min..max)
}
