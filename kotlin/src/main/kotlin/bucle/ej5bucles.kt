fun main() {
    println("Ingrese la nota que ha sacado. ")
    var nota = readLine()!!.toInt()
    when (nota) {
        in 0..4 -> println("Suspenso, has sacado un $nota")
        5 -> println("Suficiente, has sacado un $nota")
        6 -> println("Bien, has sacado un $nota")
        7 -> println("Notable bajo, has sacado un $nota")
        8 -> println("Notable alto, has sacado un $nota")
        9,10 -> println("Sobresaliente, has sacado un $nota")
        else -> println("Nota no válida")
    }
}