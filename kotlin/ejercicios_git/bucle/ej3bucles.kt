fun main() {
    println("Dime un numero positivo. ")
    var numero = readLine()!!.toInt()
    var contador = 0
    var impares = ""
    for (i in 1..numero ) {
        if (i % 2 != 0) {
            if (i == numero || i == numero - 1) {
                impares += "$i"
            }
            else {
            impares += "$i,"
            }
        }
    }
    println(impares)
}