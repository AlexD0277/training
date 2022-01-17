data class Grocery(val name:String, val category: String, val unit: String, val unitPrice: Double, val quantity: Int)

fun main() {
    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2))

    val vegetables = groceries.filter { it.category=="Vegetable" }
    println("vegetables: $vegetables")
    val notFrozen = groceries.filterNot { it.category=="Frozen" }
    println("not frozen: $notFrozen")
    val groceryNames = groceries.map({it.name})
    println("names $groceryNames")
    val newPrices = groceries.filter { it.unitPrice>3 }.map { it.unitPrice*2 }
    println("new prices: $newPrices")
    println("grocery names ")
    groceries.forEach { println(it.name)}
    println("grocery with unit price > 3")
    groceries.filter { it.unitPrice>3 }.forEach{println(it.name)}
    var itNames = ""
    groceries.forEach{itNames += "${it.name} "}
    println("item names $itNames")

}