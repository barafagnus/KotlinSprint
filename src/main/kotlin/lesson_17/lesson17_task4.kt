package lesson_17

data class Location(val latitude: Double, val longitude: Double)

class Parcel(
    val number: Int,
    currentLocation: Location
) {
    private var movementCounter: Int = 0

    var currentLocation = currentLocation
        set(value) {
            movementCounter++
            field = value
        }

    fun getMovementCounter(): Int = movementCounter
}

fun main() {
    val parcel = Parcel(1, Location(55.5, 80.2))
    println(parcel.getMovementCounter())

    parcel.currentLocation = Location(60.0, 82.0)
    println(parcel.getMovementCounter())
}