enum class Gender(val text: String) {
    MALE("мужской"),
    FEMALE("женский"),
    OTHER("другой")
}

class Person(
    val name: String,
    val gender: Gender
)

fun main() {

    val cardIndex = mutableListOf<Person>()

    println("* Введите имя человека")
    println("* Введите пол из предложенных вариантов:")
    Gender.entries.forEach { println("  - ${it.text}") }
    println()

    for (i in 1..5) {
        print("Имя: ")
        val name = readln()
        print("Пол: ")
        val gender = getGender(readln())

        val person = Person(name, gender)
        cardIndex.add(Person(name, gender))

        println("${person.name} ${person.gender.text} добавлен в картотеку")
        println()

    }

    cardIndex.forEachIndexed { index, person ->
        val onePlusIndex = index + 1
        println("$onePlusIndex - имя: ${person.name}, пол: ${person.gender.text}")
    }

}

fun getGender(gender: String): Gender {
    return when (gender) {
        "мужской" -> Gender.MALE
        "женский" -> Gender.FEMALE
        else -> Gender.OTHER
    }
}