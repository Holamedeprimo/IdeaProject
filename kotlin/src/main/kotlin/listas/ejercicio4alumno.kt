package listas

fun main() {
    val Ismael = ejercicio4_Alumno(dni = "77641868D", edad = 48 )
    val AdriSabino = ejercicio4_Alumno(dni = "666666669", edad = 63)

    Ismael.nota1= 5.10
    Ismael.nota2 = 9.30
    Ismael.nota3 = 8.75
    AdriSabino.nota1 = 5.05

    Ismael.informeAlumno()
    AdriSabino.informeAlumno()

}