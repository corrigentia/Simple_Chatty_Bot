const val ADULT = 18
const val PENSIONER = 59

fun main() {
    // write your code here
    println(readLine()!!.toInt() in ADULT..PENSIONER)
}