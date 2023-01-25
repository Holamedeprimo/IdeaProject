fun main() {
    println("Introduce la nota. ")
    val cadena = readLine()!!.toInt()
    println("Tu nota es: $cadena")
    println("Has ${if(cadena < 5) "suspendido" else "aprobado"}")
}