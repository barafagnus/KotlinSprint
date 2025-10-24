package lesson_15

interface Searchable {
    fun findComponent() { println("Выполняется поиск") }
}

abstract class Product(
    val name: String,
    val amount: Int
)

class Instrument(
    name: String,
    amount: Int
) : Product(name, amount), Searchable


class Component(
    name: String,
    amount: Int
) : Product(name, amount)