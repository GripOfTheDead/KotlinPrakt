
   import kotlin.math.pow
   fun main(args: Array<String>) {
    open class Point (_X:Double, _Y:Double){
        var X: Double
        var Y: Double
        init{
            X = _X
            Y = _Y
        }
        open fun InfoPrint(){
            println("Координаты точки: \n" +
                    "X = $X\n" +
                    "Y = $Y")
        }
    }

    class  ColoredPoint (_X: Double, _Y: Double, _color: String) :Point (_X,_Y){
        var color: String
        init {
            color = _color
        }

        override fun InfoPrint() {
            super.InfoPrint()
            println ("Цвет точки = $color")
        }
    }

    class Line(_PointOne:Point, _PointTwo: Point ){
        var pointOne:Point
        var pointTwo:Point
        val length :Double
        init {
            pointOne = _PointOne
            pointTwo = _PointTwo
            length = (Math.sqrt((pointTwo.X + pointOne.Y).pow(2) + (pointTwo.Y + pointOne.X).pow(2)))
        }
        open fun PrintInfo (){
            println("Первая точка\n ${pointOne.InfoPrint()} ")
            println("Вторая точка\n ${pointTwo.InfoPrint()}")
            println("Длина отрезка = $length")
        }

    }

    fun main(args: Array<String>) {

        var Point1: Point = Point(_X = 3.0, _Y = 5.0)
        Point1.InfoPrint()

        var ColorPont:ColoredPoint = ColoredPoint(_X = 4.0, _Y = 6.0, _color = "Черный")
        ColorPont.InfoPrint()

        var Line1:Line = Line(Point(_X = 7.0, _Y = 2.0), Point(_X = 3.0, _Y = 6.0 ))
        Line1.PrintInfo()
    }
}