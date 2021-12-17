open class Animal{
    open val image = ""
    open val food =""
    open val habitat =""
    open val hunger=10
    open fun makeNoise(){
        println("The animal making a noise")
    }
    open fun eat(){
        println("The animal is eating")
    }
    open fun roam(){
        println("The animal is roaming")
    }
    fun sleep(){
        println("The animal is sleeping")
    }
}

class Hippo:Animal(){
    override val image="Hippo.jpg"
    override val food="grass"
    override val habitat="water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }

}