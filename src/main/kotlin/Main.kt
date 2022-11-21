import java.util.*

fun main(args: Array<String>) {

    val n = Random(System.nanoTime()).nextInt(0, 100)

    val reader = Scanner(System.`in`)

    println("Отгадайте число от 1 до 100 за 10 попыток")

    var i = 1

    while (i <= 10) {
        print("$i-я попытка: ")
        val a = reader.nextInt()
        if (a > n) {
            println("Много")
        } else if (a < n) {
            println("Мало")
        } else {
            println("Угадано!")
            break
        }
        i += 1
    }
    if (i == 11) {
        print("Вы не угадали. Было загадано: $n")
    }
}