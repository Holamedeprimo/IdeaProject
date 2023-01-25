fun main() {
    val supermercado = linkedMapOf<String, Double>()
    val fija = 4
    while (supermercado.size != fija) {
        println("¿Cuál es el stock del supermercado?\nInserta primero el nombre del producto y seguidamente su precio")
        var clave = readLine()!!.toString()
        var valor = readLine()!!.toDouble()
        supermercado.put(clave, valor)
    }
    println("Indique lo que quiere hacer:\n1.Borrar producto\n2.Insertar productos\n3.Actualizar productos\n4.Comprar\n5.Adios")
    var menu = readLine()!!.toInt()
    while (menu >= 1 && menu <= 5) {
        if (menu == 1) {
            println("¿Qué producto desea borrar?")
            var borrar = readLine()!!.toString()
            supermercado.remove(borrar)
            println("Producto eliminado.")
            println(supermercado)
        }
        if (menu == 2) {
            println("Insertar producto. Primero indique la clave. ")
            var clave = readLine()!!.toString()
            println("La clave elegida es $clave , introduzca ahora el valor. ")
            var valor = readLine()!!.toDouble()
            supermercado.put(clave, valor)
            println("Producto insertado. ")
            println(supermercado)

        }
        if (menu == 3) {
            println("¿Qué producto desea actualizar?")
            var producto = readLine()!!.toString()
            var actualizado = readLine()!!.toDouble()
            if (producto in supermercado.keys) {
                supermercado[producto] = actualizado
            }

        }
        if (menu == 4) {
            println("Haz una compra de 3 productos. ")
            println("$supermercado\n Elija sus producto. ")
            val compra = emptyList<String>()
            var sumacompra = 0.0
            for (i in 0..2) {
                var productos = readLine()!!.toString()
                for ((clave, valor) in supermercado) {
                    if ((productos) == clave) {
                        sumacompra += valor
                    }
                    else {
                        println("Producto no encontrado, por favor actualicelo")
                        var actualizarclave = readLine()!!.toString()
                        var actualizarvalor = readLine()!!.toDouble()
                        supermercado.put(clave, valor)
                        sumacompra += actualizarvalor
                    }
                }
            }
                println("¿Quieres modificar el carro de la compra?\nEn caso de que sea correcto, escriba [SI]")
                var pregunta = readLine()!!.toString()
                if ((pregunta) == "SI") {
                    println("Que quieres hacer.\n1.Insertar otro producto\n2.Borrar un producto\n")
                    var eleccion = readLine()!!.toInt()
                    if (eleccion == 1) {
                        println("¿Cuantos productos quieres añadir?")
                        var numeroproductos = readLine()!!.toInt()
                        println("Indique los productos.")
                        for (i in 0..numeroproductos) {
                            var productos = readLine()!!.toString()
                            for ((clave, valor) in supermercado) {
                                if ((productos) == clave) {
                                    sumacompra += valor
                                }
                                else {
                                    println("Producto no encontrado, por favor actualicelo")
                                    var actualizarclave = readLine()!!.toString()
                                    var actualizarvalor = readLine()!!.toInt()
                                    supermercado.put(clave, valor)
                                    sumacompra += actualizarvalor
                                }
                            }
                        }
                    }
                    if (eleccion == 2) {
                        println("¿Que producto quieres eliminar? Aqui tienes tu carro de la compra\n$supermercado")
                        var borrar = readLine()!!.toString()
                        supermercado.remove(borrar)
                        println("Producto eliminado.")
                        println(supermercado)
                    }
                }
                println("Tu compra cuesta: $sumacompra euros")
            }
            if (menu == 5) {
                println("A la verga")
                break
            }
        println("Indique lo que quiere hacer:\n1.Borrar producto\n2.Insertar productos\n3.Actualizar productos\n4.Comprar\n5.Adios")
        menu = readLine()!!.toInt()
}
}