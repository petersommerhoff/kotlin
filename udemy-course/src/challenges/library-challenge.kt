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
abstract class InventoryItem(open val title: String,
                             open val genre: String,
                             open var publicationYear: Int,
                             open var borrowed: Boolean) : Lendable {

    override fun borrow() {
        if (!borrowed) {
            borrowed = true
        } else {
            println("This item is already borrowed.")
        }
    }

    // If you want, you can also add a returnItem() method so that you can also un-borrow items.

}

// A book will be not borrowed by default.
// The class is called LibraryBook to prevent name clashes with previous challenges.
class LibraryBook(override val title: String,
                  val author: String,
                  override val genre: String,
                  override var publicationYear: Int) : InventoryItem(title, genre, publicationYear, false) {

    fun read() {
        println("Reading a book by $author...")
    }
}

// A DVD will also be not borrowed by default.
class LibraryDVD(override val title: String,
                 override val genre: String,
                 val length: Int,
                 override var publicationYear: Int) : InventoryItem(title, genre, publicationYear, false) {

    fun watch() {
        println("Watching $title...")
    }
}