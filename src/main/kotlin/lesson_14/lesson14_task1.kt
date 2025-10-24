package lesson_14

open class Liner(
    open val speed: Int = 10,
    open val capacity: Int = 20
)

class IceBreaker(
    override val speed: Int = 5,
    override val capacity: Int = 10,
    val canChopIce: Boolean = true
) : Liner(speed, capacity)

class Cargo(
    override val speed: Int = 5,
    override val capacity: Int = 40
) : Liner(speed, capacity)

fun main() {
    val liner = Liner()
    val iceBreaker = IceBreaker()
    val cargo = Cargo()
}