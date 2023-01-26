package listas

class ConjuntoLibros(maximosLibros: Int) {
    var listalibros = mutableListOf<Libro>()
    var maximoLibros = 3
        get() {
            return field
        }
        set (value) {
            if (value<1 || value < listalibros.size) {
                println("Error, no puede tener menos de una pagina. ")
            }
            else
                /*
                if (value < listalibros.size) { //cambiar tamaño de lista a 1
                    while (value < listalibros.size) {
                        listalibros.removeAt(value)
                    }
                }
                */
                field = value
        }
    init {
        maximoLibros = maximosLibros
    }
    constructor(maximosLibros: Int, libroinicial: Libro):this(maximosLibros){
        listalibros.add(libroinicial) // añadimos un libro nada mas crear la lista, por eso el objeto listalibros
    }

    constructor(maximosLibros: Int, listainicial: MutableList<Libro>):this(maximosLibros){
        //
        for (libroActual in listainicial) {
            val nuevoLibro = Libro(libroActual)
            listainicial.add(nuevoLibro)
        }
    }

    fun eliminarlibros() {
        var eliminar = readLine()!!.toString()

    }

    fun añadirLibro(libroinicial: Libro) {
        if (listalibros.size < maximoLibros) {
            listalibros.add(libroinicial)
        }
        else
            println("Demasiados libros. No se pueden añadir. ")
    }

    override fun toString(): String {

        return "ConjuntoLibros($listalibros, maximoLibros=$maximoLibros)"
    }
    fun borrarPorTitulo(tituloBorrar: String) {
        for (libroactual in listalibros) {
            if(libroactual.titulo.equals(tituloBorrar)) {
                listalibros.remove(libroactual)
                break
            }
        }
    }
}
