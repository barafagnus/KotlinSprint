package lesson_14

open class Liner(
    val speed: Int = 10,
    val capacity: Int = 20
)

class IceBreaker(
    speed: Int = 5,
    capacity: Int = 10,
    val canChopIce: Boolean = true
) : Liner(speed, capacity)

class Cargo(
    speed: Int = 5,
    capacity: Int = 40
) : Liner(speed, capacity)

fun main() {
    val liner = Liner()
    val iceBreaker = IceBreaker()
    val cargo = Cargo()
}