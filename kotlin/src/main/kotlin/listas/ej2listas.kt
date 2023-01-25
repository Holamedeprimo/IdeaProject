fun main() {
    val listavacia = mutableListOf<Int>()
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