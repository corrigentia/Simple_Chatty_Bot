const val NUMBERS = 3

fun main() {
    // put your code here
    // val (a, b, n) = MutableList(NUMBERS) { readLine()!!.toInt() }
    val (a, b, n) = Array(NUMBERS) { readLine()!!.toInt() }
    /*
    var numbersDivisible = 0
    for (iteration in a..b) {
        if (iteration % n == 0) {
            numbersDivisible++
        }
    }
    println(numbersDivisible)
     */
    println(if (a % n == 0) b / n - a / n + 1 else b / n - a / n)
}
