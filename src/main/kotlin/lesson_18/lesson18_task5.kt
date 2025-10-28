class Screen {
    fun drawCircle(x: Int, y: Int): String = "Круг в x=$x y=$y"
    fun drawCircle(x: Float, y: Float): String = "Круг в x=$x y=$y"

    fun drawSquare(x: Int, y: Int): String = "Квадрат в x=$x y=$y"
    fun drawSquare(x: Float, y: Float): String = "Квадрат в x=$x y=$y"

    fun drawDot(x: Int, y: Int): String = "Точка в x=$x y=$y"
    fun drawDot(x: Float, y: Float): String = "Точка в x=$x y=$y"
}


fun main() {
    val screen = Screen()
    println(screen.drawCircle(10, 5))
    println(screen.drawCircle(10.0f, 5.0f))
}