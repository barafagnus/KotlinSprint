package lesson_15

interface Movable {

    var currentPassengers: Int
    val maxPassengers: Int

    fun startMoving() {
        when {
            currentPassengers > maxPassengers ->
                println("${javaClass.simpleName} Слишком много пассажиров, машина не может ехать")
            else -> println("${javaClass.simpleName} Машина поехала")
        }
    }

    fun stopMoving() {
        println("${javaClass.simpleName} Машина остановилась")
    }

}

interface PassengerTransport {

    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(passengers: Int) {
        when {
            passengers <= maxPassengers -> {
                currentPassengers = passengers
                println("${javaClass.simpleName} В машину загружено $currentPassengers человек")
            }
            else -> println("${javaClass.simpleName} Не хватает ${passengers - currentPassengers} мест")
        }
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
        if (weight <= maxWeight) currentWeight = weight
        else println("${javaClass.simpleName} Перегруз в ${weight - maxWeight} кг")
    }

    fun unloadCargo() {
        println("${javaClass.simpleName} Отгружен груз весом $currentWeight кг")
        currentWeight = 0.0
    }

}


class Truck() : CargoTransport, PassengerTransport, Movable {
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
    passengerCar.loadPassengers(3)
    passengerCar.startMoving()
    passengerCar.stopMoving()
    passengerCar.unloadPassengers()

    println()

    passengerCar.loadPassengers(2)
    passengerCar.startMoving()
    passengerCar.stopMoving()
    passengerCar.unloadPassengers()

}