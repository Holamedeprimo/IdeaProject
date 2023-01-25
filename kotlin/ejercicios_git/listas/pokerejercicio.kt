package listas

fun main() {
    val n1 = readLine()!!.toInt()
    val p1 = readLine()!!.toString()
    val n2 = readLine()!!.toInt()
    val p2 = readLine()!!.toString()
    var carta = Poker(n1, p1)
    carta.palo = readLine()!!.toString()
    var carta2 = Poker(n2, p2)
    carta.mostrarCarta()
    carta.compararcarta(carta2)


}