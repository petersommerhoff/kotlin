package challenges

/**
 * @author Peter Sommerhoff
 *
 * Solution for the coding challenge on classes inside the Udemy course.
 * Defines a Book class with the specified properties and methods.
 */
class Book(val title: String, val author: String, val publicationYear: Int, var borrowed: Boolean) {

    // You do not necessarily need to return a Boolean.
    fun borrow(): Boolean {
        if (!borrowed) {
            borrowed = true
            return true
        } else {
            println("Sorry, the book is already borrowed.")
            return false;
        }
    }

    // You do not necessarily need to return a Boolean.
    fun returnBook(): Boolean {
        if (borrowed) {
            borrowed = false
            return true
        } else {
            println("The book was not borrowed so it cannot be returned.")
            return false
        }
    }

    /**
     * Prints out the book to the command line including its title, author, and publication year.
     */
    fun print() {
        println("Book [title=$title, author=$author, publicationYear=$publicationYear]")
    }
}

// Let's test our class.
fun main(args: Array<String>) {
    val book = Book("The One Thing", "Gary Keller", 2013, false)
    book.returnBook()   // Does not work because we did not borrow it yet.
    book.borrow()       // Let's borrow it.
    book.borrow()       // We cannot borrow again without returning.
    book.returnBook()   // Let's return it.
    book.print()        // And print it out.
}