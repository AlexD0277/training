class BadException : Exception()

fun riskyCode(test:String) {
    if (test == "Yes") {throw BadException()}
    print("r")
    print("o")
}
fun myFunction(test: String) {
    try {
        print("t")
        print("h")
        riskyCode(test)
    } catch (e: BadException) {
        print("a")
    } finally {
        print("w")
        print("s")
    }
}
fun main() {
    myFunction("es")
}
//281