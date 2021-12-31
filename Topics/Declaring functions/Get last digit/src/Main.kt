import kotlin.math.absoluteValue

const val TEN = 10

// write your code here
fun getLastDigit(number: Int): Int = number.absoluteValue % TEN

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
