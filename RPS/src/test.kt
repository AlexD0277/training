fun main() {
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")
    var pets = mutableListOf<String>()
    pets.addAll(petsLiam)
    pets.addAll(petsEmily)
    pets.addAll(petsNoah)
    pets.addAll(petsSophia)
    println(pets)
    println(pets.size)
    pets.sort()
    println(pets.toSet())
}



//281