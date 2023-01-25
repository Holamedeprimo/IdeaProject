import kotlin.random.Random

fun main() {
    var random = Random.nextInt(0, 100)
    val miArray= Array(5, {0})
    println(miArray.contentToString())
    for ( i in miArray.indices) {
        miArray[i] = Random.nextInt(0, 100)
    }
    println(miArray.contentToString())
    var valorGrande = miArray[0]
    var valorPequeño = miArray[0]
    for ( x in miArray.indices) {
        if (miArray[x] > valorGrande) {
            valorGrande = miArray[x]
        }
        if ( miArray[x] < valorPequeño) {
            valorPequeño = miArray[x]
        }
    }
    println("El valor mas grande es $valorGrande y el mas pequeño es $valorPequeño")
}