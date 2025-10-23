const val KELVIN = 273

class WeatherForecast(
    kelvinDayTemperature: Int,
    kelvinNightTemperature: Int,
    val isPrecipitation: Boolean
) {
    val daytimeTemperature = kelvinDayTemperature - KELVIN
    val nightTemperature = kelvinNightTemperature - KELVIN

    fun showWeather() {
        println("t днем: $daytimeTemperature, ночью $nightTemperature, осадки: ${if (isPrecipitation) "да" else "нет"}")
    }
}

fun main() {

    val mondayWeather = WeatherForecast(300, 310, true)
    mondayWeather.showWeather()

}

