abstract class Pet(var name:String)

class Cat(name: String):Pet(name)
class Dog1(name: String):Pet(name)
class Fish(name: String):Pet(name)
class Contest<T:Pet>(var vet:Vet<in T>)
{
    val scores:MutableMap<T,Int> = mutableMapOf()
    fun addScore(t:T, score: Int=0){
        if (score>=0)scores.put(t,score)
    }
    fun getWinners():MutableSet<T>
    {
        val winners:MutableSet<T> = mutableSetOf()
        val highScore = scores.values.maxOrNull()
        for ((t,score)in scores){
            if (score==highScore) winners.add(t)
        }
        return  winners
    }

}
interface Retailer<out T>{
fun sell():T
}
class catRetailer:Retailer<Cat>{
    override fun sell(): Cat {
        println("Sell cat")
        return Cat("")
    }
}
class dogRetailer:Retailer<Dog1>{
    override fun sell(): Dog1 {
        println("Sell dog")
        return Dog1("")
    }
}
class fishRetailer:Retailer<Fish>{
    override fun sell(): Fish {
        println("Sell fish")
        return Fish("")
    }
}
class Vet<T:Pet>{
    fun treat(t: T){
        println("Threat pet ${t.name}")
    }
}
fun main() {

    val catK = Cat("Kuzia")
    val catM = Cat("Markiz")
    val fishF = Fish("Finny")
    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()
    catVet.treat(catK)
    petVet.treat(catM)
    petVet.treat(fishF)
    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catK,79)
    catContest.addScore(catM,54)
    val topCat = catContest.getWinners().first()
    println("The winner in cats contest is ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catK,79)
    petContest.addScore(fishF,80)
    val topPet = petContest.getWinners().first()
    println("The pets contest winner is ${topPet.name}")
    val fishContest = Contest<Fish>(petVet)
    val dogRetailer:Retailer<Dog1> = dogRetailer()
    val catRetailer:Retailer<Cat> = catRetailer()
    val petRetailer:Retailer<Pet> = catRetailer()
    petRetailer.sell()


}