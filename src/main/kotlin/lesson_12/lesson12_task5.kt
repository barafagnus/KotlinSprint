package lesson_12

import kotlin.random.Random

class WeatherForecast(
    _daytimeTemperature: Int,
    _nightTemperature: Int,
    _isPrecipitation: Boolean
) {
    val daytimeTemperature = _daytimeTemperature - 273
    val nightTemperature = _nightTemperature - 273
    val isPrecipitation = _isPrecipitation

    init {
        println("t днем: $daytimeTemperature, ночью $nightTemperature, осадки: ${if (isPrecipitation) "да" else "нет"}")
    }

}


fun main() {
    val temperatureRange = 273..320

    val data = mutableListOf<WeatherForecast>()

    for (i in 1..30) {
        val weather = WeatherForecast(
            _daytimeTemperature = temperatureRange.random(),
            _nightTemperature = temperatureRange.random(),
            _isPrecipitation = Random.nextBoolean()
        )
        data.add(weather)
    }

    val averageDaytimeTemperature = data.map { forecast -> forecast.daytimeTemperature }.average()
    val averageNightTemperature = data.map { forecast -> forecast.nightTemperature }.average()
    val numberOfPrecipitationDays = data.filter { it.isPrecipitation }.size

    println()
    println(
        """
        Средняя температура днем ${averageDaytimeTemperature.toInt()} °C
        Средняя температура ночью ${averageNightTemperature.toInt()} °C
        Дней с осадками $numberOfPrecipitationDays
    """.trimIndent()
    )

}

