import java.io.File

fun main(args: Array<String>) {
    var lineNumber = 0
    val lines = File("udemy-course/resources/inputfile.txt").readLines()

    for (line in lines) {
        ++lineNumber
        println("Line $lineNumber: ${line}")
    }
}