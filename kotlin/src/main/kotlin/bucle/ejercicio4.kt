fun main() {
    println("introduce el primer numero: ")
    var numero1 = readLine()!!.toInt()
    println("introduce el segundo numero: ")
    var numero2 = readLine()!!.toInt()
    if ( numero1 > numero2) {
        println("El mayor es $numero1")
    } else {
        println("El mayor es $numero2")
    }
}