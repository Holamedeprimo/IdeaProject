package listas
class Libro(titulo: String, autor: String, npag: Int, calificacion: Int) {
    var titulo = titulo
        get(): String = field
    var autor = autor
        get(): String = field
    var npag = npag
        get(): Int = field
    var calificacion = calificacion
        get(): Int = field
        set(valor) {
            if (calificacion >= 0 && calificacion <= 10) {
                field = valor
            }
        }
    var listalibros = mutableListOf<Libro>()

}