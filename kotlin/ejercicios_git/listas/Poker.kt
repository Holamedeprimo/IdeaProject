package listas

class Poker (numero: Int, palo: String) {
    var numero = numero
        get(): Int = field
        set(valor) {
            if (numero >= 1 && numero <=13) {
                field = valor
            }
        }
    var palo = palo
        get(): String = field
        set(valor) {
            if (palo == "c" && palo == "p" && palo == "r" && palo == "t") {
               field = valor
            }
            else {
                println("Error")
            }
        }
    constructor(copia: Poker) : this(copia.numero, copia.palo)
    fun mostrarCarta() {
        var palomostrar = ""
        when(numero) {
            1 -> "As"
            11 -> "Jack"
            12 -> "Reina"
            13 -> "Rey"
        }
        when (palo) {
            "c" -> palomostrar = ("Corazones")
            "p" -> palomostrar = ("Picas")
            "r" -> palomostrar = ("Rombos")
            "t" -> palomostrar = ("Treboles")
        }
        println("Es el numero $numero de palo $palomostrar")
    }
    fun compararcarta(carta: Poker) {
        if (carta.numero > this.numero) {
            println("La ganadora es ")
            carta.mostrarCarta()
        }
        else if (carta.numero < this.numero) {
            println("La ganadora es ")
                this.mostrarCarta()
        }
        else if (carta.numero == this.numero) {
            if (carta.palo > this.palo) {
                println("La ganadora es ")
                carta.mostrarCarta()
            }
            else if (carta.palo < this.palo) {
                println("La ganadora es ")
                this.mostrarCarta()
            }
            else {
                println("Empate")
            }
        }
    }
}