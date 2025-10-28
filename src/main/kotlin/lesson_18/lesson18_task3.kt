package lesson_18

abstract class Animal(
    val name: String
) {
    abstract val food: String

    open fun eat() {
        println("$name кушает $food")
    }

    open fun sleep() {
        println("$name спит")
    }
}

class Fox(name: String) : Animal(name) {
    override val food: String = "ягоды"
}

class Dog(name: String) : Animal(name) {
    override val food: String = "кости"
}

class Cat(name: String) : Animal(name) {
    override val food: String = "рыбу"
}

fun main() {
    val animals = listOf<Animal>(
        Fox("Лис"),
        Dog("Пёс"),
        Cat("Кыц")
    )

    animals.forEach {
        it.eat()
    }
}