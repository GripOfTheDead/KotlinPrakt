import kotlin.math.PI
import kotlin.math.sqrt
import kotlin.math.pow


fun main(args: Array<String>)
{
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved +=1

    val agE: Int = 18
    exercisesSolved +=1

    var middleAge: Double = 18.0
    middleAge = (middleAge + 30) / 2
    exercisesSolved +=1

    val testNumber: Int = 33
    val evenOdd: Int = testNumber % 2
    exercisesSolved +=1

    var answer:Int = 0
    answer +=1
    answer +=10
    answer *=10
    answer shr 3
    exercisesSolved +=1

    var age: Int = 0
    age = 16
    //println(age)
    age = 30
    //println(age)
    exercisesSolved +=1

    val a:Int = 46
    val b:Int = 10
    val answer1:Int = (a * 100) + b
    val answer2:Int = (a * 100) + (b * 100)
    val answer3:Int = (a * 100) + (b/10)
    /*println(answer1)
    println(answer2)
    println(answer3)*/
    exercisesSolved +=1

    ((5 * 3) - ((4 / 2) * 2))
    exercisesSolved +=1

    val a1: Double = 7.0
    val b1: Double = 12.0
    val average: Double = a1 % b1
    exercisesSolved +=1

    val fahrenheit: Double = 10.0
    var celcius: Double = fahrenheit / 1.8 - 32
    //println(celcius)
    exercisesSolved +=1

    val position: Int = 35
    val row: Int = position / 8
    val column: Int = position % 8
    //println(row)
    //println(column)
    exercisesSolved +=1

    val degrees: Double = 75.0
    val radians: Double = 75.0 * PI / 180
    //println(radians)
    exercisesSolved +=1

    val x1: Double = 5.0
    val y1: Double = 7.0
    val x2: Double = 15.0
    val y2: Double = 3.0
    var distance = sqrt(((x1 - x2).pow(2.0)) + ((y1 - y2).pow(2.0))).toDouble()
    //println(distance)
    exercisesSolved +=1
    println(exercisesSolved)
}