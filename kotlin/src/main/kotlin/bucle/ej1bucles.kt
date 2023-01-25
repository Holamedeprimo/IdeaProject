fun main() {
    println("Ingrese una palabra. ")
    var palabra = readLine()!!.toString()
    var contador = 0
    while (contador != 10) {
        println(palabra)
        contador += 1
    }
}