data class Recipes(val title:String,val isVegetarian:Boolean)

fun main() {
    val r1 = Recipes("Thai curry",false)
    val r2 = Recipes("Thai curry",false)
    val r3 = r1.copy("Chicken bhuna")
    println("r1 hash code ${r1.hashCode()}")
    println("r2 hash code ${r2.hashCode()}")
    println("r3 hash code ${r3.hashCode()}")
    println("r1 to string ${r1.toString()}")
    println("r1 == r2 ${r1 == r2}")
    println("r1 === r2 ${r1 === r2}")
    println("r1 == r3 ${r1 == r3}")
    val (title,veg) = r1
    println("title is $title, veg is $veg")
    //232
}