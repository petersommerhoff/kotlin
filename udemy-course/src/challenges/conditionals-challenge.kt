package challenges

import java.util.*

/**
 * @author Peter Sommerhoff
 *
 * Solution for the coding challenge on conditionals inside the Udemy course.
 * Generate a random number between 0 and 49 and checks in which range it is.
 */
fun main(args: Array<String>) {
    val random = Random().nextInt(50)

    when (random) {
        in 1..10 -> println("In 1 to 10: $random")
        in 11..20 -> println("In 11 to 20: $random")
        in 21..30 -> println("In 21 to 30: $random")
        in 31..40 -> println("In 31 to 40: $random")
        else -> println("Over 40: $random")
    }
}