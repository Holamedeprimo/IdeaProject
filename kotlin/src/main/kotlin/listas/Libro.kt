package listas
class Libro(titulo: String, autor: String, npag: Int, calificacion: Int) {
    var titulo = titulo
    var autor = autor
    var npag = npag
        get(): Int = field
        set (value) {
            if (value < 1) {
                println("No puede tener menos de una pagina.")
            } else
            field = value
        }
    var calificacion = calificacion
        get(): Int = field
        set(valor) {
            if (calificacion >= 0 && calificacion <= 10) {
                field = valor
            }
        }
    var listalibros = mutableListOf<Libro>()
    constructor(otroLibro: Libro):this(otroLibro.titulo,otroLibro.autor,otroLibro.npag,otroLibro.calificacion){
        //a partir de un liibro, creo otro con los mismos valores
    }

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', npag=$npag, calificacion=$calificacion, listalibros=$listalibros)"
    }


}