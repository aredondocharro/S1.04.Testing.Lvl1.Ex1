import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    void initializeLibraryShouldNotReturnNull() {

        Library library = BookManager.initializeLibrary();

        assertNotNull(library, "The method initializeLibrary() should not return null");
    }

    @Test
    void initializeLibrarySizeExpected() {
        Library library = BookManager.initializeLibrary();

        assertEquals(5, library.getBooks().size(), "List should be size 5");
    }

    @Test
    void testBookExistsInLibrary() {
        Library library = BookManager.initializeLibrary();

        assertTrue(library.lookIfBookExist("The Little Prince"),
                "The Library should have 'The Little Prince'");

        assertFalse(library.lookIfBookExist("Test Book for failure"),
                "The Library shouldn't have 'Test Book for failure'");
    }

    @Test
    void testNoDuplicateBooks() {
        Library library = new Library();
        Book book = new Book("The Little Prince");

        library.addBook(book);
        library.addBook(book);

        assertEquals(1, library.getBooks().size(), "Added 2 times the same book in a empty list. The size of list should be 1.");
    }


    @Test
    public void testAddBookAtSpecificPosition() {
        library.addBook(new Book("BookTestC"));
        library.addBook(new Book("BookTestA"));
        library.addBookAtIndex(new Book("BookTestB"), 1);

        List<Book> bookList = library.getBooks();
        assertTrue(bookList.contains(new Book("BookTestB")));
        assertEquals(3, bookList.size());


        assertEquals("BookTestC", bookList.get(0).getTitle());
        assertEquals("BookTestB", bookList.get(1).getTitle());
        assertEquals("BookTestA", bookList.get(2).getTitle());
    }

    @Test
    public void testRemoveBookByTitle() {
        library.addBook(new Book("1984"));
        library.addBook(new Book("One Hundred Years of Solitude"));
        library.removeBookByTitle("1984");

        List<Book> bookList = library.getBooks();
        assertEquals(1, bookList.size());
        assertFalse(bookList.contains(new Book("1984")));
    }

    @Test
    public void testAlphabeticalOrderAfterAddAndRemove() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book2"));
        books.add(new Book("Book1"));
        books.add(new Book("Book3"));

        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });

        assertEquals("Book1", books.get(0).getTitle());
        assertEquals("Book2", books.get(1).getTitle());
        assertEquals("Book3", books.get(2).getTitle());


        books.removeIf(book -> book.getTitle().equalsIgnoreCase("Book2"));


        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });

        assertEquals(2, books.size());
        assertEquals("Book1", books.get(0).getTitle());
        assertEquals("Book3", books.get(2).getTitle());


        for (Book b : books) {
            System.out.println(b);
        }
    }

}
