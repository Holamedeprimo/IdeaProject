fun main() {
    var i = 0
    val miArray2 = Array(10, {i -> i + 1})
    var par = ""
    var impar = ""
    for ( x in miArray2.indices) {
        if ( miArray2[x] % 2 == 0) {
            par += miArray2[x].toString() + ","
        }
        else {
            impar += miArray2[x].toString() + ","
        }
    }
    println("Los pares son $par\b y los impares son $impar\b")
}