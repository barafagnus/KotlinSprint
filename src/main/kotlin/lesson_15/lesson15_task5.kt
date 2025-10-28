package lesson_15

interface Movable {

    fun startMoving() {
        println("${javaClass.simpleName} Машина поехала")
    }

    fun stopMoving() {
        println("${javaClass.simpleName} Машина остановилась")
    }

}

interface PassengerTransport {

    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(passengers: Int) {
        currentPassengers = (currentPassengers + passengers).coerceAtMost(maxPassengers)
        println("${javaClass.simpleName} В машину загружено $currentPassengers человек")
    }

    fun unloadPassengers() {
        if (currentPassengers > 0) {
            println("${javaClass.simpleName} Пассажиры высажены в количестве $currentPassengers человек")
            currentPassengers = 0
        } else println("${javaClass.simpleName} В машине нет пассажиров")
    }

}

interface CargoTransport {

    val maxWeight: Double
    var currentWeight: Double

    fun loadCargo(weight: Double) {
        currentWeight = (currentWeight + weight).coerceAtMost(maxWeight)
        println("${javaClass.simpleName} В машину загружен груз весом $currentWeight кг")
    }

    fun unloadCargo() {
        println("${javaClass.simpleName} Отгружен груз весом $currentWeight кг")
        currentWeight = 0.0
    }

}


class Truck : CargoTransport, PassengerTransport, Movable {
    override var currentPassengers: Int = 0
    override val maxPassengers: Int = 1
    override var currentWeight: Double = 0.0
    override val maxWeight: Double = 2_000.0
}

class PassengerCar : PassengerTransport, Movable {
    override var currentPassengers: Int = 0
    override val maxPassengers: Int = 3
}

fun main() {

    val truck = Truck()
    truck.loadCargo(2_000.0)
    truck.loadPassengers(1)
    truck.startMoving()
    truck.stopMoving()
    truck.unloadCargo()
    truck.unloadPassengers()

    println()

    val passengerCar = PassengerCar()
    passengerCar.loadPassengers(4)
    passengerCar.startMoving()
    passengerCar.stopMoving()
    passengerCar.unloadPassengers()

    println()

    passengerCar.loadPassengers(2)
    passengerCar.startMoving()
    passengerCar.stopMoving()
    passengerCar.unloadPassengers()

}