package listas

class ejercicio1_Rectángulo(base: Double, altura: Double) {
    var base: Double
    var altura: Double
    init {
        this.base = base
        this.altura = altura
    }
    /*ejemplo de constructor secundario*/
    constructor(altura: Double):this(0.0, altura) {
        this.altura = altura
    }

    fun area():Double {
        val area = base * altura
        println("El área del rectángulo es de $area centimetros.")
        return area
    }
    fun perimetro(): Double {
        val perimetro = (base*2) + (altura*2)
        println("El périmetro es de $perimetro centimetros.")
        return perimetro
    }

}

