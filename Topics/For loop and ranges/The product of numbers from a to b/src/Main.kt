fun main() {
    // put your code here
    var product = 1L
    for (iteration in readLine()!!.toLong() until readLine()!!.toLong()) {
        product *= iteration
    }
    println(product)
}