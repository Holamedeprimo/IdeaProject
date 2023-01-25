package listas

class ejercicio4_Alumno(dni: String, edad: Int, nota1: Double, nota2: Double, nota3: Double) {
    var dni = dni
        get(): String = field
        set(valor) {
            field = valor
        }
    var edad = edad
        get(): Int = field
        set(valor) {

        }
    var nota1 = nota1
        get() = field
        set(valor) {
            if (valor >=0 && valor <=10) {
            field = valor
            }
        }
    var nota2 = nota2
        get() = field
        set(valor) {
            if (valor >=0 && valor <=10) {
                field = valor
            }
        }
    var nota3 = nota3
        get() = field
        set(valor) {
            if (valor >=0 && valor <=10) {
                field = valor
            }
        }

    constructor(dni: String, edad: Int):this(dni, edad, -1.00,-1.00,-1.00)
    fun arraymedia(notas: Array<Double>): Double{
        return notas.average()
    }
    fun cadena(): String {
        return "dni: $dni\nedad: $edad\nnota1: $nota1\nnota2: $nota2\nnota3: $nota3\n"
    }
    fun informeAlumno()  {
        println("${cadena()} notafinal: ${notafinal()}")
    }
    fun notafinal(): Double {
        if (nota1 == -1.00 || nota2 == -1.00 || nota3 == -1.00) {
            return -1.00
        } else
            return (nota1 + nota2 + nota3) / 3
}
}