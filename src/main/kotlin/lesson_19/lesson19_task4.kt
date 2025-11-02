package lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var ammo: Ammo? = null

    fun reload(ammoType: Ammo) {
        ammo = ammoType
    }

    fun shoot() {
        if (ammo != null) println("Нанесенный урон: ${ammo?.damage}")
        else println("Оружие не заряжено")
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()
    tank.reload(Ammo.BLUE)
    tank.shoot()
    tank.reload(Ammo.GREEN)
    tank.shoot()
}