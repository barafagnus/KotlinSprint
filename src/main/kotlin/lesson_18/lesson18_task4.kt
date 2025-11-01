package lesson_18

abstract class Box {
    abstract fun calculateSurfaceArea(): Double
}

class RectBox(
    val length: Double,
    val width: Double,
    val height: Double
    ) : Box() {
    override fun calculateSurfaceArea(): Double = 2 * (length * height + width * height)
}

class CubeBox(
    val ribLength: Double
) : Box() {
    override fun calculateSurfaceArea(): Double = 6 * ribLength * ribLength
}

fun main() {

    listOf<Box>(
        RectBox(2.0, 4.0, 2.0),
        CubeBox(4.0)
    ).forEach {
        println(it.calculateSurfaceArea())
    }

}