package challenges

/**
 * @author Peter Sommerhoff
 *
 * Solution for the coding challenge on object orientation inside the Udemy course.
 * Defines some simple interfaces and classes for a library inventory system.
 */
interface Lendable {
    fun borrow()
}

// The properties title, genre, and publicationYear can be included in the parent class because both books and DVDs
// have these properties. The author and length properties however are included only in the child classes.
abstract class InventoryItem(val title: String,
                             val genre: String,
                             var publicationYear: Int,
                             var borrowed: Boolean) : Lendable {

    override fun borrow() {
        if (!borrowed) {
            borrowed = true
        } else {
            println("This item is already borrowed.")
        }
    }

    // If you want, you can also add a returnItem() method so that you can also un-borrow items.


    override fun toString(): String {
        return "InventoryItem(title='$title', genre='$genre', publicationYear=$publicationYear, borrowed=$borrowed)"
    }

    abstract fun copy(): InventoryItem

}

// A book will be not borrowed by default.
// The class is called LibraryBook to prevent name clashes with previous challenges.
class LibraryBook(title: String,
                  val author: String,
                  genre: String,
                  publicationYear: Int) : InventoryItem(title, genre, publicationYear, false) {

    fun read() {
        println("Reading a book by $author...")
    }

    override fun copy(): InventoryItem {
        val copy = LibraryBook(title, author, genre, publicationYear)
        copy.borrowed = this.borrowed

        return copy
    }
}

// A DVD will also be not borrowed by default.
class LibraryDVD(title: String,
                 genre: String,
                 val length: Int,
                 publicationYear: Int) : InventoryItem(title, genre, publicationYear, false) {

    fun watch() {
        println("Watching $title...")
    }

    override fun copy(): InventoryItem {
        val copy = LibraryDVD(title, genre, length, publicationYear)
        copy.borrowed = this.borrowed

        return copy
    }
}