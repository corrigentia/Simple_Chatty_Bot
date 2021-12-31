const val THREE = 3
const val FIVE = 5

fun main() {
    // write your code here
    for (iteration in readLine()!!.toInt()..readLine()!!.toInt()) {
        val iterationDivisibleBy5: Boolean = iteration % FIVE == 0
        println(
            if (iteration % THREE == 0) {
                if (iterationDivisibleBy5) {
                    "FizzBuzz"
                } else {
                    "Fizz"
                }
            } else if (iterationDivisibleBy5) {
                "Buzz"
            } else {
                iteration
            }
        )
    }
}
