class ClassBook(val title: String, val author: String)

data class DataClassBook(val title: String, val author: String)

fun main() {

    val regularBook = ClassBook("Дюна", "Френк Герберт")
    val dataBook = DataClassBook("Трое в лодке, не считая собаки", "Джером Клапка Джером")

    // Выводит имя класса и его хэш-код
    println(regularBook)

    // Выводит реализацию метода toString()
    println(dataBook)

}