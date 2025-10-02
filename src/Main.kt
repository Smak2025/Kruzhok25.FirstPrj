import kotlin.math.sqrt

fun main() {
//    println("Привет, Мир Kotlin!")
//    var x: Int
//    // var y = 11
//    val z = 3.5
//    x = z.toInt()
//    // z = y.toDouble()
//    val data = readln().toInt()
//    println(x + data)
//    if (x + data >= 0) {
//        println(x + data)
//    } else {
//        println(-x - data)
//    }

    println("Введите коэффициент a ")
    val a = readln().toDouble()
    println("Введите коэффициент b ")
    val b = readln().toDouble()
    println("Введите коэффициент c ")
    val c = readln().toDouble()

    if (a != 0.0) {
        val d = b * b - 4 * a * c
        val x1 = (-b - sqrt(d)) / (2 * a)
        val x2 = (-b + sqrt(d)) / (2 * a)
        println(x1)
        println(x2)
    }
    else {
        if (b != 0.0) {
            val x = -c / b
            println(x)
        }
        else {
            if (c == 0.0) {
                println("x - любое")
            }
            else {
                println("Нет решений")
            }
        }
    }
}