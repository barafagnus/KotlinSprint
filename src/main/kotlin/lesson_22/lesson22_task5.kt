import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceFromEarth: Double
)


fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "тройная звёздная система в созвездии Центавра",
        dateTime = LocalDateTime.of(2026, 5, 5, 5, 5, 5),
        distanceFromEarth = 4.367
    )

    println(alphaCentauri)
    println()

    val (name, description, dateTime, distanceFromEarth) = alphaCentauri
    println("название - $name\nописание - $description\nвремя - $dateTime\nрасстояние от земли $distanceFromEarth")
    println()

    println(alphaCentauri.component1())
    println(alphaCentauri.component2())
    println(alphaCentauri.component3())
    println(alphaCentauri.component4())

}
