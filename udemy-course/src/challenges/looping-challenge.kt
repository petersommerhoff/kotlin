package challenges

/**
 * @author Peter Sommerhoff
 *
 * Solution for the looping challenge inside the Udemy course.
 * Calculates the sum of all numbers from 100 to 100,000.
 */
fun main(args: Array<String>) {

    var sum = 0L
    for (i in 100..100000L) {
        sum += i
    }

    println(sum) // Result: 5000045050
}