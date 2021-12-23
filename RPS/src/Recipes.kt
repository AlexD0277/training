data class Recipes(val title:String,
                   val mainIngredient:String,
                   val isVegetarian:Boolean=false,
                    val difficulty: String="Easy")
class Mushroom(val size:Int,val isMagic:Boolean){
    constructor(isMagic_param:Boolean):this(0,isMagic_param)
}
fun findRecipes(title:String="",
                mainIngredient:String="",
                isVegetarian:Boolean=false,
                difficulty: String=""):Array<Recipes>{
    return arrayOf(Recipes(title,mainIngredient,isVegetarian,difficulty))
}

fun addNumbers(a:Int,b:Int):Int{
    return a+b
}
fun addNumbers(a:Double,b:Double):Double{
    return a+b
}


fun main() {
    val r1 = Recipes("Thai curry","Chicken")
    val r2 = Recipes(title= "Thai curry",mainIngredient = "Chicken")
    val r3 = r1.copy("Chicken bhuna")
    println("r1 hash code ${r1.hashCode()}")
    println("r2 hash code ${r2.hashCode()}")
    println("r3 hash code ${r3.hashCode()}")
    println("r1 to string ${r1.toString()}")
    println("r1 == r2 ${r1 == r2}")
    println("r1 === r2 ${r1 === r2}")
    println("r1 == r3 ${r1 == r3}")
    val (title,mainIng,veg,diff) = r1
    println("title is $title, veg is $veg")
    val m1=Mushroom(10,true)
    println("Mushroom 1 size is ${m1.size}, isMagic ${m1.isMagic}")
    val m2=Mushroom(false)
    println("Mushroom 2 size is ${m2.size}, isMagic ${m2.isMagic}")
    println(addNumbers(2,5))
    println(addNumbers(2.6,4.5))
    //245
}