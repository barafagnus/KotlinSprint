package org.example.lesson_4

fun main() {
    val totalTables: Short = 13
    val todayTablesBooked: Short = 13
    val tomorrowTablesBooked: Short = 9

    println("Доступность столиков на сегодня: ${totalTables > todayTablesBooked}")
    println("Доступность столиков на завтра: ${totalTables > tomorrowTablesBooked}")
}