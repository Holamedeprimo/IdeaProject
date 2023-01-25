package listas
/*ejemplo de constructor primario, en la propia declaracion de la clase*/
class ejercicio2_coche constructor(color: String,marca: String, modelo: String, n_caballos: Int, n_puertas: Int, matricula: String){
    var color: String
    var marca: String
    var modelo: String
    var n_puertas: Int
    var n_caballos: Int
    var matricula: String
    init {
        this.color = color
        this.marca = marca
        this.modelo = modelo
        this.n_puertas = n_puertas
        this.n_caballos = n_caballos
        this.matricula = matricula
    }
}