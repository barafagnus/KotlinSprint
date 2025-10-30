class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {

    val regularBook = RegularBook("Дюна", "Френк Герберт")
    val dataBook = DataBook("Трое в лодке, не считая собаки", "Джером Клапка Джером")

    // Выводит имя класса и его хэш-код
    println(regularBook)

    // Выводит реализацию метода toString()
    println(dataBook)

}