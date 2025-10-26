abstract class WeatherStationStats

class Temperature(val temperature: Double) : WeatherStationStats()

class PrecipitationAmount(val precipitationAmount: Double) : WeatherStationStats()

class WeatherServer {
    fun sendMessage(weatherStationStats: WeatherStationStats) {
        when (weatherStationStats) {
            is Temperature -> println("Temperature: ${weatherStationStats.temperature}")
            is PrecipitationAmount -> println("Precipitations: ${weatherStationStats.precipitationAmount}")
            else -> println("Неверные данные")
        }
    }
}

fun main() {

    val temperature = Temperature(25.0)
    val precipitationAmount = PrecipitationAmount(4.0)

    val weatherServer = WeatherServer()
    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitationAmount)

}