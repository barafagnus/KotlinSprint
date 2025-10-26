package lesson_14

abstract class CelestialBody(
    open val name: String,
    open val hasAtmosphere: Boolean,
    open val isLandable: Boolean
)

class Planet(
    override val name: String,
    override val hasAtmosphere: Boolean,
    override val isLandable: Boolean,
    val satellites: List<Satellite>
) : CelestialBody(name, hasAtmosphere, isLandable)

class Satellite(
    override val name: String,
    override val hasAtmosphere: Boolean,
    override val isLandable: Boolean
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
