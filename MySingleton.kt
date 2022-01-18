object MySingleton {
    val myProp = 42
    
    fun myFunc() = "Hello"
}

fun main() {
    println(MySingleton.myProp)
    println(MySingleton.myFunc())
}
