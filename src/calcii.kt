import java.util.*
import kotlin.Double
fun main (args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter  four  numbers: ")
    val x = reader.nextDouble()
    val y = reader.nextDouble()
    val z = reader.nextDouble()
    val k = reader.nextDouble()
    print("Enter an operator (+, -, *, /,%): ")
    val operator = reader.next()[0]
    val output: Double
    when (operator) {
        '+' ->output = x+y+z+k
        '-' -> output =x-y-z-k
        '*' -> output =x*y*z*k
        '/' -> output =x/y/z/k
        '%' -> output =x%y%z%k
        else -> {
            System.out.printf("Error! operator is not correct")
            return
        }
    }
    System.out.printf("%.1f %c %.1f %c %.1f %c %.1f = %.1f", x, operator, y, operator, z , operator, k ,output)
}
