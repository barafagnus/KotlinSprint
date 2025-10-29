enum class SpeechModifier(val function: (String) -> String) {
    STANDARD({ phrase: String -> phrase }),
    REVERSE({ phrase: String -> phrase.reversed() });
}

class Robot {

    private var modifier: SpeechModifier = SpeechModifier.STANDARD
    private val phrases = listOf<String>(
        "Бип-буп...",
        "Я - робот",
        "Готов служить",
        "Низкий уровень заряда",
        "Начинаю уборку"
    )

    fun say() {
        println(modifier.function(phrases.random()))
    }

    fun setModifier(modifierType: SpeechModifier) {
        modifier = modifierType
    }

}

fun main() {
    val robot = Robot()
    robot.say()

    robot.setModifier(SpeechModifier.REVERSE)
    robot.say()
}