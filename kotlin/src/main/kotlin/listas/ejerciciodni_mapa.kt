fun main() {
    val mapa = sortedMapOf<String,String>()
    val fija = 5
    while (mapa.size != fija) {
        println("Dime primero DNI y luego nombre completo")
        var clave = readLine()!!.toString()
        var valor = readLine()!!.toString()
        mapa.put(clave, valor)
    }
    println("$mapa")
}