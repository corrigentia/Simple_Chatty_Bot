import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val numbers = scanner.nextInt()
    var total = 0
    while (scanner.hasNextInt()) {
        total += scanner.nextInt()
    }
    println(total)
}