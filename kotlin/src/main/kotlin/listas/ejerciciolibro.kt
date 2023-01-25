package listas

fun main() {
    var titulo = readLine()!!.toString()
    var autor = readLine()!!.toString()
    var npag = readLine()!!.toInt()
    var calificacion = readLine()!!.toInt()
    var librosLeidos = Libro(titulo, autor, npag, calificacion)


}