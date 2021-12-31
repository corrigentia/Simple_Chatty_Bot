import kotlin.math.pow

const val NUMBERS = 4
const val ZERO = 0
const val THOUSAND = 1_000

private const val THREE = 3

private const val TWO = 2

fun main() {
    // put your code here
    val (a, b, c, d) = Array(NUMBERS) { readLine()!!.toInt() }
    for (x in ZERO..THOUSAND) {
        // println(a * x.toDouble().pow(3) + b * x.toDouble().pow(2) + c * x + d)
        // println(0.toDouble())
        // println(a * x.toDouble().pow(3) + b * x.toDouble().pow(2) + c * x + d == 0.toDouble())

        if (a * x.toDouble().pow(THREE) + b * x.toDouble().pow(TWO) + c * x + d == ZERO.toDouble()) {
            println(x)
        }
    }
}
