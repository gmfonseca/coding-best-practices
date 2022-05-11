package br.com.gmfonseca.coding

const val isStuff = false

data class Something(val isActive: Boolean = true)

fun main() {
    foobar(true, Something(false))
}

fun foobar(isSome: Boolean, something: Something? = null): String {
    val isSomethingActive = something != null && something.isActive
    // ...
    if (something == null || isSomethingActive) {
        if (!isStuff) {
            // ...
            if (isSome) return "some thing"
            return "other thing"
        }
    }
    if (isSome) return "some stuff"
    return "other stuff"
}
