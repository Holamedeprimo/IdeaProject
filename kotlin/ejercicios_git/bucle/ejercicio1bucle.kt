fun main() {
    println("Dime un numero. ")
    var numero = readLine()!!.toInt()
    for (i in numero downTo 0) {
        println(i)
    }
}