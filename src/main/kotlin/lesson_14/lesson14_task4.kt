package lesson_14

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandable: Boolean
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val satellites: List<Satellite>
) : CelestialBody(name, hasAtmosphere, isLandable)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean
) : CelestialBody(name, hasAtmosphere, isLandable)

fun main() {

    val mars = Planet(
        name = "Марс",
        hasAtmosphere = true,
        isLandable = true,
        satellites = listOf(
            Satellite("Фобос", false, true),
            Satellite("Деймос", false, true)
        )
    )

    println("Планета: ${mars.name}, спутники: ${mars.satellites.joinToString { it.name }}")

}
