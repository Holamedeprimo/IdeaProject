fun main() {
    println("Ingresa tu edad. ")
    var edad = readLine()!!.toInt()
    var contador = 1
    while (contador <= edad) {
        println(contador)
        contador += 1
    }
}