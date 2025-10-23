class Weather(
    var daytimeTemperature: Double,
    var nightTemperature: Double,
    var precipitation: Boolean
) {

    fun showWeather() {
        println("t днем: $daytimeTemperature, ночью $nightTemperature, осадки: ${if (precipitation) "да" else "нет"}")
    }
}

fun main() {

    val mondayTemperature = Weather(25.0, 8.0, true)
    val tuesdayTemperature = Weather(23.0, 11.0, false)

    mondayTemperature.showWeather()
    tuesdayTemperature.showWeather()

}

