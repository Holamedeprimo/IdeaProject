package listas

class Address {
    var name: String = ""
    var street: String = ""
    fun copyAddress(address: Address): Address {

        val result = Address() // there's no 'new' keyword in Kotlin

        result.name = address.name // accessors are called

        result.street = address.street

        // ...

        return result

    }

}
