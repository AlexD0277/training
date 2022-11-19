data class Grocery(val name:String, val category: String, val unit: String, val unitPrice: Double, val quantity: Int)

fun main() {
    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2))

    groceries.groupBy { it.category }.forEach{
        println(it.key)
        it.value.forEach{ println("  ${it.name}")}
    }
    val ints = listOf(1,2,3,4)
    val sumOfInts = ints.fold(0){rez,item->rez+item}
    println("Sum of ints $sumOfInts")
    val names = groceries.fold(""){res,item-> res+" ${item.name}"}
    println("Names $names")

//    val summ = groceries.filter { it.category == "Vegetable" }.fold(0.0){res,item->res+item.unitPrice*item.quantity}
//    groceries.filter { it.unitPrice * it.quantity < 5.0 }.map { it.name }
//    groceries.groupBy { it.category }.forEach {
//        println("Category ${it.key} ${it.value.fold(0.0) { res, item -> res + item.unitPrice * item.quantity }}")
      groceries.filterNot {it.unit=="Bottle" }.groupBy { it.unit }.forEach {
        println(it.key)
          return@forEach
        it.value.forEach{ println("   ${it.name}")}
      }

}
