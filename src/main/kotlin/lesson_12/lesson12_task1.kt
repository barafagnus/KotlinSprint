class DailyWeather() {
    var daytimeTemperature: Double = 20.0
    var nightTemperature: Double = 10.0
    var precipitation: Boolean = false

    fun showWeather() {
        println("t днем: $daytimeTemperature, ночью $nightTemperature, осадки: ${if (precipitation) "да" else "нет"}")
    }
}

fun main() {

    val mondayTemperature = DailyWeather()
    val tuesdayTemperature = DailyWeather()
    mondayTemperature.showWeather()
    println()
    tuesdayTemperature.showWeather()
    println()

    mondayTemperature.daytimeTemperature = 25.0
    mondayTemperature.nightTemperature = 8.0
    mondayTemperature.precipitation = true

    tuesdayTemperature.daytimeTemperature = 23.0
    tuesdayTemperature.nightTemperature = 11.0

    mondayTemperature.showWeather()
    println()
    tuesdayTemperature.showWeather()
}

