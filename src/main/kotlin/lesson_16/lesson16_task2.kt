private const val PI: Double = 3.14

class Circle(
    private val radius: Double
) {
    fun calculateCircumference() = 2 * PI * radius

    fun calculateArea() = PI * radius * radius
}

fun main() {
    val circle = Circle(10.0)
    println(circle.calculateCircumference())
    println(circle.calculateArea())
}