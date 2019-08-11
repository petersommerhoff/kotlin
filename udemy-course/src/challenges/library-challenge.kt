package challenges

interface Lendable
{
    fun borrow()
    fun returnItem()
}

interface Viewable
{
    fun view()
}

abstract class InventoryItem(
    val title: String,
    val genre: String,
    val publicationYear: Int
): Lendable, Viewable
{
    private var borrowed = false
    private var returned = true

    override fun borrow() {
        this.borrowed = true
    }

    override fun returnItem() {
        this.returned = true
    }

    override fun toString(): String {
        return "InventoryItem(title=$title, genre=$genre, year=$publicationYear, borrowed=$borrowed"
    }
}

class Book(
    title: String,
    genre: String,
    publicationYear: Int,
    private val author: String
): InventoryItem(title, genre, publicationYear)
{
    override fun view() {
        println("Reading $title ($genre) by $author published $publicationYear ...")
    }
}

class Dvd(
    title: String,
    genre: String,
    publicationYear: Int,
    private val lengthInMinutes: Int
): InventoryItem(title, genre, publicationYear)
{
    override fun view() {
        println("Watching $title ($genre). Length $lengthInMinutes min. Released $publicationYear")
    }
}

fun main() {
    val book = Book(
        "A Book Title",
        "A Fun Genre",
        2000,
        "An Author Name"
    )

    println(book)

    val dvd = Dvd(
        "A DVD Title",
        "A Fun Genre",
        2000,
        180
    )

    println(dvd)
}
