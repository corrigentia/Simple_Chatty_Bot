import java.util.*

fun main() {
    // write your code
    val scanner = Scanner(System.`in`)
    val numbers = scanner.nextInt()
    val numberArray = MutableList(numbers) { scanner.nextInt() }
    /*
    println(numberArray)
    println(numberArray.sorted())
     */
    println(
        if (numberArray == numberArray.sorted()) {
            "YES"
        } else {
            "NO"
        }
    )

}