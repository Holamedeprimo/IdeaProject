package listas

class ConjuntoLibros(ConjuntoLibros: MutableList<Libro>) {
    var listalibros = mutableListOf<Libro>()
    fun eliminarlibros() {
        var eliminar = readLine()!!.toString()

    }
    fun añadirlibro(Nuevo: Libro) {
        listalibros.add((Nuevo))
    }

}
