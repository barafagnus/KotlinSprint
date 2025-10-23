package lesson_12
import kotlin.random.Random

const val KELVIN = 273

class WeatherForecast(
    kelvinDayTemperature: Int,
    kelvinNightTemperature: Int,
    val isPrecipitation: Boolean
) {
    val daytimeTemperature = kelvinDayTemperature - KELVIN
    val nightTemperature = kelvinNightTemperature - KELVIN


    init {
        println("t днем: $daytimeTemperature, ночью $nightTemperature, осадки: ${if (isPrecipitation) "да" else "нет"}")
    }

}


fun main() {
    val temperatureRange = 273..320
    val data = List(30) {
        WeatherForecast(
            temperatureRange.random(),
            temperatureRange.random(),
            Random.nextBoolean()
        )
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

