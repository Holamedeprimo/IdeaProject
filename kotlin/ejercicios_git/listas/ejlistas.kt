fun main() {
    val fooMutableList = mutableListOf("a", "b", "c")
    fooMutableList.add("d")
    //println(fooMutableList.last()) // => d
    //println(fooMutableList.size) // => 4
    fooMutableList.remove("b")
    //println(fooMutableList[1])
    //println(fooMutableList.size) // => 3
    fooMutableList.removeAt(0)
    fooMutableList[0] = "e"
    for ((key, value) in fooMutableList.withIndex()) {
        println(value)
    }
}