package listas

class ejercicio3_Tiempo(hora:Int,minuto:Int,segundo:Int){
    var hora = hora
    var minuto = minuto
    var segundo = segundo
    constructor(hora: Int, minuto: Int):this(hora, minuto, 0)
    constructor(hora: Int):this(hora,0,0)
}