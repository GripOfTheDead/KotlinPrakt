fun main()
{
    // Задание 1
    fun printFullName() {
        val firstName = "Konstantin"
        val lastName = "Filip'ev"
        println("$firstName $lastName")
    }
    // Задание 2

    printFullName()

    // Задание 3

    fun calculateFullName(firstName: String, lastName: String): String
    {
        return firstName + " " + lastName
    }
    val fullName: String = calculateFullName(firstName, lastName)
    println(fullName)

    // Задание 4

    fun calculateFullNameNew(firstName: String, lastName: String): Pair<String, Int> {
        val fullName = firstName + " " + lastName
        return Pair(fullName, fullName.length)
    }
    val fullNameNew = calculateFullNameNew(firstName, lastName)
    println(fullNameNew)

    // Задание 5

    fun primeNumber(number: Int): Boolean
    {
        for (i in 2..(Math.sqrt(number.toDouble()).toInt()) step 1)
        {
            if (number % i == 0)
                return false
        }
        return true
    }
    val number:Int=999
    print("Простые числа: ")
    for (i in 2 ..number step 1)
    {
        if(primeNumber(i)) print("$i, ")
    }

    //Задание 6
    fun fibonacci(number: Int): Int
    {
        if (number == 1 || number == 2)
            return 1
        return (fibonacci(number - 1) + fibonacci(number - 2))
    }
    println()
    print("Фибоначчи: ")
    for (i in 1..10 step 1)
    {
        print("$i - ${fibonacci(i)}     ")
    }
}