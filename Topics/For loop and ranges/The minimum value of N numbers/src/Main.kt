import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val numbers = scanner.nextInt()
    var min = scanner.nextInt()
    while (scanner.hasNextInt()) {
        val current = scanner.nextInt()
        if (current < min) min = current
    }
    println(min)

}