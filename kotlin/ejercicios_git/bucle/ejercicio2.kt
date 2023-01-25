fun main() {
    val ingreso = readLine()!!.toFloat()
    val gasto = readLine()!!.toFloat()
    println("Tus ingresos son: $ingreso y tus gastos son: $gasto")
    val diferencia = ingreso - gasto
    println("${if (diferencia < 0) "Estas en deuda" else "Enhorabuena, te sobran $diferencia euros"}")
}