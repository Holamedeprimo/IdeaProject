package listas

fun main() {
    /*Demostracion de constructor*/
    val rectangulo = ejercicio1_Rectángulo(4.0, 3.0)
    println("Esta es la informacion del triangulo 1. Base: ${rectangulo.base}\n Altura: ${rectangulo.altura}")
    rectangulo.area()
    rectangulo.perimetro()
    val rectangulo2 = ejercicio1_Rectángulo(40.0, 4.0)
    println("Esta es la informacion del triangulo 1. Base: ${rectangulo2.base}\n Altura: ${rectangulo2.altura}")
    rectangulo2.area()
    rectangulo2.perimetro()
    val rectangulo3 = ejercicio1_Rectángulo(2.0, 5.0)
    rectangulo3.base = 2.0
    rectangulo3.altura = 5.0
    println("Esta es la informacion del triangulo 1. Base: ${rectangulo3.base}\n Altura: ${rectangulo3.altura}")
    rectangulo3.area()
    rectangulo3.perimetro()
}