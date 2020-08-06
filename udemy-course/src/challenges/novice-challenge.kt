package challenges

/**
 * @author Peter Sommerhoff
 *
 * Solution for the novice challenge inside the Udemy course.
 * Creates a list of book titles, loops over it and, if the title contains 'e', prints each char of the title in a line.
 */
fun main(args: Array<String>) {

    val myBookArrayList: ArrayList<String> = arrayListOf(
            "In Search of Lost Time",
            "Ulysses",
            "Don Quixote",
            "The Great Gatsby",
            "One Hundred Years of Solitude",
            "Moby Dick",
            "War and Peace",
            "Lolita",
            "Hamlet",
            "The Catcher in the Rye"
    )

    for (book in myBookArrayList) {
        if (book.contains('e')) {
            for (myChar in book) {
                println(myChar)
            }
            println("#######################################################################")
        }

    }
}
