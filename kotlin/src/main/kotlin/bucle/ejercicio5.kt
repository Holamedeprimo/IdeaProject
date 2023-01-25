fun main() {
    println("introduce el dividendo: ")
    var dividendo = readLine()!!.toFloat()
    println("introduce el divisor: ")
    var divisor = readLine()!!.toFloat()
    var division= dividendo / divisor
    if ((divisor - 0.0) < 0.001) {
        println("Error, el divisor no puede ser 0. ")
    } else {
        println("El resultado de la division es: $division")
    }
}
/*fun main() {
    println("introduce el dividendo: ")
    var dividendo = readLine()!!.toFloat()
    println("introduce el divisor: ")
    var divisor = readLine()!!.toInt()
    var division= dividendo / divisor
    if ((divisor == 0) {
        println("Error, el divisor no puede ser 0. ")
    } else {
        println("El resultado de la division es: $division")
    }
}
*/