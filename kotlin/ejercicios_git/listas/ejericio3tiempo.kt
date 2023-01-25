package listas

fun main() {
    println("Si quiere añadir hora,min y segundo pulse 1\nSi quiere añadir hora y minuto, pulse 2\nSi no, pulse 3.")
    val menu = readLine()!!.toInt()
    if (menu == 1) {
        println("Va a introducir hora, minuto y segundo")
        var horaintroducida = readLine()!!.toInt()
        var minutointroducido = readLine()!!.toInt()
        var segundointroducido = readLine()!!.toInt()
        var reloj = ejercicio3_Tiempo(hora = horaintroducida, minuto = minutointroducido, segundo = segundointroducido)
    }
    if (menu == 2) {
        println("Va a introducir hora y minuto")
        var horaintroducida = readLine()!!.toInt()
        var minutointroducido = readLine()!!.toInt()
        var reloj = ejercicio3_Tiempo(hora = horaintroducida, minuto = minutointroducido, 0)
    }
    if (menu == 3) {
        println("Va a introducir hora")
        var horaintroducida = readLine()!!.toInt()
        var reloj = ejercicio3_Tiempo(hora = horaintroducida, 0, 0)
    }
}