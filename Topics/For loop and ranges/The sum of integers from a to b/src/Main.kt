fun main() {
    // put your code here
    var total = 0
    for (iteration in readLine()!!.toInt()..readLine()!!.toInt()) {
        total += iteration
    }
    println(total)
}
