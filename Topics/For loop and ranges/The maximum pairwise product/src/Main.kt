import java.util.*

fun main() {
    // write your code here
    // hyperskill-4704-test-06
    /*
4
4
11
12
11
     */
    val scanner = Scanner(System.`in`)
    val numbers = scanner.nextInt()
    val numberArray = Array(numbers) { scanner.nextInt() }
    numberArray.sortDescending()
    /*
    var maxProduct: Int = numberArray.first()

    if (numberArray.size > 1) {
        for (left in 0 until numberArray.size - 1) {
            for (right in 1 until numberArray.size) {

                val leftNumber = numberArray[left]
                val rightNumber = numberArray[right]
                val currentProduct = leftNumber * rightNumber

                if (currentProduct > maxProduct) maxProduct = currentProduct

                /*
                if (leftNumber > rightNumber) {
                    val temp = numberArray[right]
                    numberArray[right] = numberArray[left]
                    numberArray[left] = temp
                }
                 */
            }
        }
    }

    println(maxProduct)
     */

    println(
        if (numberArray.size > 1) numberArray.first() * numberArray[1] else numberArray.first()
    )
}