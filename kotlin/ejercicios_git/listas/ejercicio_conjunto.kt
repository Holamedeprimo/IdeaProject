import listas.Address

fun main() {
    val listavacia = mutableSetOf<Int>()
    var numeros = Address()
    numeros.name = "Cabezon"
    numeros.street = "21"
    while (listavacia.size < 5) {
        var leer = readLine()!!.toInt()
        if (leer in listavacia) {
            println("Numero ya introducido. ")
            leer = readLine()!!.toInt()
        }
        listavacia.add(leer)
    }
    println(listavacia)
}