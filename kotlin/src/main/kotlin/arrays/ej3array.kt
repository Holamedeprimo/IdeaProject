import kotlin.random.Random

fun main() {
    val miArray= Array(10, {0})
    println(miArray.contentToString())
    var pedirnumero = 0
    for ( i in miArray.indices) {
        println("Dime un numero")
        pedirnumero = readLine()!!.toInt()
        while (pedirnumero > 0) {
            println("Debes introducir un negativo")
            pedirnumero = readLine()!!.toInt()
        }
        miArray[i] = pedirnumero

    }
    println(miArray.contentToString())
}