fun main(args: Array<String>) {

    println("There's a lot of echo here...")

    var lastLine: String? = ""
    while(lastLine != "quit()") {
        print(">> ")
        lastLine = readLine()
        println(lastLine)
    }
}