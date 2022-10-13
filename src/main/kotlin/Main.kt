import javax.management.relation.RoleList
import kotlin.random.Random

fun main() {
    // Задание 1
    val myAge = 18
    val isTeeneger: Boolean = myAge in 13..19
    // Задание 2
    val theirAge = 30
    val bothTeenagers: Boolean = isTeeneger == theirAge in 13..19
    // Задание 3
    val reader = "Константин"
    val author = "Richard Lucas"
    val authorlsReader = reader == author
    // Задание 4
    val readerBeforeAuthor = reader > author
    // Задание 5
    val myAge2 = 18
    if (myAge2 in 13.. 19)
        println("Подросток")
    else
        println("Не подросток")
    // Задание 6
    val answer = if(myAge2 in 13..19) "Подросток" else "Не подросток"
    println(answer)
    // Задание 7
    var counter = 0
    while (counter<10) {
        var x:Int = counter
        counter+=1
        println(counter)
    }
    // Задание 8

    var roll = 0
    do
    {
        roll = Random.nextInt(6)
        counter += 1
        println("После $counter бросков, roll равен $roll")

    } while (roll != 0)

    // Задание 9
    val range=1..10
    for (i in range)
        println(i*i)

    //Задание 10
    for (i in range)
        println(Math.sqrt(i.toDouble()))

    //Задание 11
    var sum = 0
    for (row in 1 until 8 step 2)
    {
        for (column in 0 until 8)
        {
            sum += row * column
        }
    }
    println(sum)
}