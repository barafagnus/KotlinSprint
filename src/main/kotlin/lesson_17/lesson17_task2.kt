class Ship(
    name: String,
    val averageSpeed: Int,
    val homePort: String
) {
    var name = name
        set(value) {
            println("Имя корабля изменять нельзя!")
        }
}

fun main() {
    val ship = Ship("Арабелла", 50, "Бриджтаун")
    ship.name = "Ласточка"
    println(ship.name)
}