fun main() {
    println("Introduce palabras. Te diré la más larga")
    var frase = readLine()!!.toString()
    var palabras = frase.split(" ")
    var palabramaslarga = ""
    for (palabra in palabras) {
        if (palabra.length > palabramaslarga.length) {
            palabramaslarga = palabra
        }
    }
    println("La palabra mas larga es: $palabramaslarga")
    println("El numero de palabras es de: ${palabras.size}")
}