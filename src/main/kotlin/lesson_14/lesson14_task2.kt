package lesson_14

open class Liner2(
    open val speed: Int = 10,
    open val capacity: Int = 20
) {

    open fun loading() {
        println("Горизонтальный трап со шкафута выдвинут")
    }

    open fun showShipInfo() {
        println("${this::class.simpleName} скорость: $speed, вместимость: $capacity")
    }

}

class IceBreaker2(
    override val speed: Int = 5,
    override val capacity: Int = 10,
    val canChopIce: Boolean = true
) : Liner2(speed, capacity) {

    override fun loading() {
        println("Ворота со стороны кормы открыты")
    }

    override fun showShipInfo() {
        println("${this::class.simpleName} скорость: $speed, вместимость: $capacity, может колоть лед: $canChopIce")
    }

}

class Cargo2(
    override val speed: Int = 5,
    override val capacity: Int = 40
) : Liner2(speed, capacity) {

    override fun loading() {
        println("Погрузочный кран активирован")
    }

}

fun main() {
    val liner = Liner2()
    val iceBreaker = IceBreaker2()
    val cargo = Cargo2()

    liner.loading()
    iceBreaker.loading()
    cargo.loading()

    liner.showShipInfo()
    iceBreaker.showShipInfo()
    cargo.showShipInfo()
}