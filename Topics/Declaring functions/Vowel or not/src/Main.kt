// write your function here
fun isVowel(letter: Char) = letter.lowercaseChar() in "aeiou"

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}