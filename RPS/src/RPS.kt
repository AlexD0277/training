fun getGameChoise(optionsParam:Array<String>)= optionsParam[(Math.random()*optionsParam.size).toInt()]
fun main() {
    val options = arrayOf("Rock","Paper", "Scissors")
    val gameChoice = getGameChoise(options)
    //107
}