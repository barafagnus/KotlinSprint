import kotlin.math.PI

abstract class Figure(
    val color: String
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double
) : Figure(color) {
    override fun calculateArea(): Double = PI * radius * radius

    override fun calculatePerimeter(): Double = 2 * PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double
) : Figure(color) {
    override fun calculateArea(): Double = width * height

    override fun calculatePerimeter(): Double = 2 * (width + height)
}

fun main() {

    val figures = listOf<Figure>(
        Circle("black", 5.0),
        Circle("white", 10.0),
        Rectangle("black", 5.0, 5.0),
        Rectangle("white", 10.0, 5.0)
    )

    val blackFiguresPerimeter = figures
        .filter { it.color == "black" }
        .sumOf { it.calculatePerimeter() }

    val whiteFiguresArea = figures
        .filter { it.color == "white" }
        .sumOf { it.calculateArea() }

    println("Сумма периметров черных фигур: $blackFiguresPerimeter")
    println("Сумма площадей белых фигур: $whiteFiguresArea")

}