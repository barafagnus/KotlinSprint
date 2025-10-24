package lesson_15

interface Search {
    fun findComponent() { println("Выполняется поиск") }
}

abstract class Product(
    val name: String,
    val amount: Int
)

class Instrument(
    name: String,
    amount: Int
) : Product(name, amount), Search


class Component(
    name: String,
    amount: Int
) : Product(name, amount)