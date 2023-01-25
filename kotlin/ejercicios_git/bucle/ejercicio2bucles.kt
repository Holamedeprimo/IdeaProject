fun main() {
    println("Ingrese cuantos pisos de escalera quiere imprimir: ")
    var escalera = readLine()!!.toInt()
    var cadena = ""
    for (i in 1 .. escalera) {
        cadena += "*"
        println(cadena)
    }
}