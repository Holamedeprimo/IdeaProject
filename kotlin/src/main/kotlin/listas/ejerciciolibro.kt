package listas

fun main(args: Array<String>) {
    val libroPrueba = Libro(titulo = "Anillo", autor = "Jesus", npag = 50, calificacion = 9)
    println(libroPrueba.toString())
    val Biblioteca = ConjuntoLibros(maximosLibros = 4, libroPrueba)
    println("Introduce max libros")
    Biblioteca.maximoLibros = readLine()!!.toInt()
    println(Biblioteca.toString())
    val libroPrueba2 = Libro(titulo = "loco", autor = "Jesus", npag = 50, calificacion = 9)
    Biblioteca.añadirLibro(libroPrueba2)
    val libroPrueba3 = Libro(titulo = "puto", autor = "Jesus", npag = 50, calificacion = 9)
    Biblioteca.añadirLibro(libroPrueba3)
    println("cambiar tamaño a 1")
    Biblioteca.maximoLibros=1
    println(Biblioteca.toString())

    /*
    println(Biblioteca.toString())
    println("Eliminar anillos\n")
    Biblioteca.borrarPorTitulo(tituloBorrar = "Anillo")
    println(Biblioteca.toString())
    Biblioteca.borrarPorTitulo(tituloBorrar = "loco")
    println(Biblioteca.toString())
     */

}