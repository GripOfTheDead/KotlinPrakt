fun main(args: Array<String>) {
    // Задание 1

    val age1 = 42.0
    val age2 = 21.0
    //Задание 2-3

    //  42 и 21 были типа Int, и он бы считал неправльно, поэтому я добавил .0 чтобы тип стал Double
    val avg1 = (age1+age2)/2
    //Задание 4

    val firstName = "Константин"
    val lastName = "Филипьев"
    // Задание 5

    val fullName = "$firstName $lastName"
    //Задание 6

    val myDetails = "Привет, меня зовут $fullName"
    // Задание 7

    val date:Triple<Int,Int,Int> = Triple(12, 6, 2013)
    // Задание 8

    val (month,day,year) = date
    // Задание 9

    var (monthTwo, _, yearTwo) = date
    // Задание 10

    monthTwo = 4
    val newTriple = Pair(monthTwo, yearTwo)
    println(newTriple)

}
