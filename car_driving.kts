enum class Color {
    BLACK,
    BLUE,
    WHITE,
    RED
}

class Car(
    var color: Color,
    val model: String,
    private var speed: Int,
    var gas: Int
) {
    fun getSpeeds() {
        if (speed == 0) {
            println("$color $model needs for speed.")
        }
        println("now speed : $speed")
        println("gas gauge : $gas")
    }

    fun increaseSpeed() {
        if (speed == 0) {
            println("$color $model drive start!")
        } else {
            println("$color $model is still driving.")
        }
        speed += 30
        gas -= 10
    }

//    fun decreaseSpeed() {
//        speed -= 30
//    }

    fun addGas(newGas: Int): Unit {
        speed = 0
        gas += newGas
        println("Gas has filled! gas gauge is $gas")
    }
}

val myCar = Car(Color.BLACK, "Sonata", 0, 10)
println(myCar.getSpeeds())
myCar.addGas(100)
for (i in 1..10) {
    myCar.increaseSpeed()
    println(myCar.getSpeeds())
}
