interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class CrucianCarp : Swimmable {
    override fun swim() {
        println("Карп плывет под водой")
    }
}

class Seagull : Flyable {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck : Swimmable, Flyable {
    override fun swim() {
        println("Утка плавает на поверхности воды")
    }

    override fun fly() {
        println("Утка летает")
    }
}

fun main() {
    val crucianCarp = CrucianCarp()
    crucianCarp.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.fly()
    duck.swim()
}