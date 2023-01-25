fun pareimpar() {
    println("Introduce un numero. ")
    var numero = readLine()!!.toInt()
    println("${if ( numero % 2 != 0) "Impar" else "par" }")
}
fun main() {
    println("Dime un numero: ")
    var numero = readLine()!!.toInt()
    if ((numero % 2) != 0) {
        println("Impar")
    } else {
        println("Par")
    }
}

