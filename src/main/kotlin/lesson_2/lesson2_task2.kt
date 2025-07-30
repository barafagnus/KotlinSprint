package org.example.lesson_2

fun main() {
    val workers: Short = 50
    val workersSalary: Short = 30000
    val interns: Short = 30
    val internsSalary: Short = 20000

    val workersExpenses: Int = workers * workersSalary
    val intenrsExpenses: Int = interns * internsSalary
    val summaryExpenses: Int = workersExpenses + intenrsExpenses
    val averageSalary: Int = summaryExpenses / (workers + interns)
    println("Расходы на выплату постоянных сотрудников: $workersExpenses")
    println("Общие расходы ЗП после прихода стажеров: $summaryExpenses")
    println("Средняя ЗП после прихода стажеров: $averageSalary")
}