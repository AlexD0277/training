class Dog(val name:String, var weight_param: Int, val breed_param:String){
    init{
        println("Dog $name has been created.")
    }
    var activities = arrayOf("Walks")
    val breed =  breed_param.uppercase()
    init{
        println("The breed is $breed.")
    }
    var weight = weight_param
        set(value) {
            if (value>0) field=value
        }
    val weightInKg:Double
        get() = weight/2.2
    fun Bark(){
        println(if (weight<20) "Тяв" else "Гав")
    }
}


fun main(){
    val myDog = Dog("Kuzia",15,"gray")
    myDog.Bark()
    myDog.weight = 75
    println("Weight in kg ${myDog.weightInKg}")
    myDog.weight=-2
    println("Weight is ${myDog.weight}")
    myDog.activities= arrayOf("Walks","Fetching balls","Frisbee")
    for(item in myDog.activities){
        println("${myDog.name} enjoys $item")
    }


}