typealias DoubleConversation = (Double)->Double
fun convert(x: Double,converter: DoubleConversation):Double{
    val result = converter(x)
    println("$x is converted to $result")
    return result
}
fun getConversation(str:String):DoubleConversation{
    if (str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32 }
    } else if (str == "KgsToPounds") {
        return { it * 2.204623 }
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}
fun combain(lambda1:DoubleConversation,lambda2:DoubleConversation):DoubleConversation{
    return {x:Double->lambda2(lambda1(x))}
}
fun main() {
    println("Convert 2.5 kg to Pounds: ${getConversation("KgsToPounds")(2.5)}")
    val kgsToPoundsLambda = getConversation("KgsToPounds")
    val poundsToUSTonsLambda = getConversation("PoundsToUSTons")
    val kgsToUSTonsLambda = combain(kgsToPoundsLambda,poundsToUSTonsLambda)
    println("17.4 kg is ${convert(17.4,kgsToUSTonsLambda)} US tons")
}

