class WeatherForecast(
    _daytimeTemperature: Int,
    _nightTemperature: Int,
    _isPrecipitation: Boolean
) {
    val daytimeTemperature = _daytimeTemperature - 273
    val nightTemperature = _nightTemperature - 273
    val isPrecipitation = _isPrecipitation

    fun showWeather() {
        println("t днем: $daytimeTemperature, ночью $nightTemperature, осадки: ${if (isPrecipitation) "да" else "нет"}")
    }
}

fun main() {

    val mondayWeather = WeatherForecast(300, 310, true)
    mondayWeather.showWeather()

}

