package listas

class Cuenta(numCuenta: Int, saldoDisponible: Double, recibirAbonos: Double, realizarPagos: Double) {
    var numCuenta: Int  = numCuenta
        get(): Int = field
        set(value) {
            if (value < 1) {
                println("Numero de cuenta invalido. ")
            }
            else
                field = value
        }
    var saldoDisponible: Double = saldoDisponible
        get(): Double = field


    fun mostrarSaldo() {
        println(saldoDisponible)
    }
    fun recibirAbono(otraCuenta: Cuenta, dineroRecibir: Double) {
        otraCuenta.saldoDisponible = otraCuenta.saldoDisponible - dineroRecibir
        this.saldoDisponible = dineroRecibir + saldoDisponible
        println("El dinero recibido es de: $dineroRecibir")
        println("Tu cuenta dispone de: ${this.saldoDisponible}.")
    }
}