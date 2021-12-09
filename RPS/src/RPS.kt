fun getGameChoise(optionsParam:Array<String>)= optionsParam[(Math.random()*optionsParam.size).toInt()]
fun getUserChoise(optionsParam:Array<String>):String{
    var isValidChoise=false
    var userChoise =""
    while(!isValidChoise){
        print("Please enter one of the following: ")
        for(item in optionsParam)print(" $item")
        println(".")
        var userInput = readLine()
        if(userInput!=null&& userInput in optionsParam){
            isValidChoise=true
            userChoise = userInput
        }
        else println("enter valid choise")
    }
    return userChoise
}
fun main() {
    val options = arrayOf("Rock","Paper", "Scissors")
    val gameChoice = getGameChoise(options)
    val userChoise = getUserChoise(options)
    //111
}