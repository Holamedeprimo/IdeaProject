import kotlin.system.exitProcess

fun main() {
    val lista = mutableListOf<String>("a", "b", "c", "b")
    println("Elige que desea hacer:\n(1)Mostrar la lista\n(2)Insertar caracter en una posicion\n(3)Actualizar o modificar caracter en una posicion\n(4)Borrar caracter en una posicion.\n(5)Borrar caracter por valor indicado.\n(6)Modificar toda ocurrencia repetida por una introducida")
    var menu = readLine()!!.toInt()
    while (menu >= 1 && menu <=7) {
        if (menu == 1) {
            println(lista)
        }
        if (menu == 2) {
            println("Te voy a mostrar el tamaño de la lista, para que puedas elegir la posición correctamente. Tiene ${lista.size} posiciones")
            var posicion2 = readLine()!!.toInt()
            println("Dime el caracter a introducir: ")
            var caracter = readLine()!!.toString()
            lista.add(posicion2, caracter)
            println("Así se ha quedado la lista: $lista")
            println(lista)
        }
        if (menu == 3) {
            println("Actualiza (modifica) caracter en una posicion. Dime que posicion quieres modificar")
            println("Te voy a mostrar el tamaño de la lista, para que puedas elegir la posición correctamente. Tiene ${lista.size} posiciones")
            var posicion = readLine()!!.toInt()
            var modificacion = readLine()!!.toString()
            println("El caracter $modificacion será actualizado en la lista en la posición $posicion")
            lista[posicion] = modificacion
            println(lista)
        }
        if (menu == 4) {
            println("Borrar caracter en una posicion. Dime que posicion quieres borrar")
            var posicion3 = readLine()!!.toInt()
            println("El caracter en la posición $posicion3 será eliminado.")
            lista.removeAt(posicion3)
            println(lista)
        }
        if (menu == 5) {
            println("Borrar caracter por valor.  Dime que valor quieres borrar. ")
            println(lista)
            var borrar = readLine()!!.toString()
            lista.remove(borrar)
            println("Valor borrado. $lista")
        }
        if (menu == 6) {
            println("Se reemplazarán todas las ocurrencias con mismo valor por el que usted introduzca.")
            val cambio = readLine()!!.toString()
            println("Ahora introduzca el valor a cambiar. ")
            val resultado = readLine()!!.toString()
            for (i in 0..(lista.size - 1)) {
                if (cambio == lista[i]) {
                    lista[i] = resultado
                }
            }
            println(lista)
        }
        if (menu == 7) {
            break
        }
    }
}