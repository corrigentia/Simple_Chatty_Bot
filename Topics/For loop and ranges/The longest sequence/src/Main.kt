import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val howMany = scanner.nextInt()
    val arrayOfNums = Array(howMany) { scanner.nextInt() }
    /*
    val longestSubSeqnc = mutableListOf<Int>()
    val secndLongestSubSeqnc = mutableListOf<Int>()

    println(arrayOfNums)

    for (num in arrayOfNums) {
        println(num)
        println(longestSubSeqnc)
        if (longestSubSeqnc.isEmpty()) longestSubSeqnc.add(num) else
            if (num >= longestSubSeqnc.last()) {
                longestSubSeqnc.add(num)
            }
    }

    println(longestSubSeqnc)
     */
    /*
    for (left in 0 until arrayOfNums.lastIndex) {
        for (right in 1 .. arrayOfNums.lastIndex) {
            if (right >= left)
        }
    }
     */
    // var where = 0
    val longestSqnc = MutableList(howMany) { 1 }
    if (arrayOfNums.size > 1) {
        /*
        for (num in arrayOfNums) {
            for (i in arrayOfNums.indices) {
                if (arrayOfNums.indexOf(num) == i - 1) {
                    if (arrayOfNums[i] >= num) longestSqnc[where] = longestSqnc[where] + 1 else where++
                }
            }
        }
         */
        var lengthOfNonDecreasing = 1
        for (i in 0 until arrayOfNums.lastIndex) {
            if (arrayOfNums[i + 1] >= arrayOfNums[i]) lengthOfNonDecreasing++ else lengthOfNonDecreasing = 1
            longestSqnc.add(lengthOfNonDecreasing)
        }
    }
    longestSqnc.sortDescending()
    println(longestSqnc.first())
}