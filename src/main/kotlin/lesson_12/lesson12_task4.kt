class WeatherForecast(
    _daytimeTemperature: Int,
    _nightTemperature: Int,
    _precipitation: Boolean
) {
    val daytimeTemperature = _daytimeTemperature - 273
    val nightTemperature = _nightTemperature - 273
    val isPrecipitation = _precipitation

    init {
        println("t днем: $daytimeTemperature, ночью $nightTemperature, осадки: ${if (isPrecipitation) "да" else "нет"}")
    }

}

fun main() {

    val mondayWeather = WeatherForecast(300, 310, true)

}

