import java.lang.Exception

class Wolf1{
    var hunger = 10
    val food = "meat"
    fun eat(){
        println("the wolf is eating $food")
    }
}
class MyWolf{
    var wolf:Wolf1?=Wolf1()
    fun MyFun(){
        wolf?.eat()
    }
}
fun GetAlphaWolf():Wolf1?{
    return Wolf1()
}
fun main() {
    var w:Wolf1?=Wolf1()
    if (w!=null)w.eat()
    var x=w?.hunger
    println("x=$x")
    var y=w?.hunger ?:-1
    println("y=$y")
    var myWolf=MyWolf()
    myWolf?.wolf?.hunger=8
    println("myWolf?.wolf?.hunger=${myWolf?.wolf?.hunger}")
    var myArray= arrayOf("Hi","Hello",null)
    for (item in myArray){
        item?.let { println(it) }
    }
    GetAlphaWolf()?.let { it.eat() }
    w = null
    try {
        w?.hunger
    }catch (e:Exception){
        e.printStackTrace()
    }
}
//273