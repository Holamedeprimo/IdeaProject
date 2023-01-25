fun main() {
    println("Dime una palabrilla. ")
    var palabra = readLine()!!.toString()
    var count = palabra.length
    var palabrareversa = ""
    for (i in palabra.length - 1 downTo  0) {
        palabrareversa += palabra[i]
    }
    if (palabrareversa == palabra) {
        println("La palabra es capicúa. ")
    } else {
        println("No es capicúa. ")
    }
}