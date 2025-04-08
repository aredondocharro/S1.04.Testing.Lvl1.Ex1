import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }


    public void addBookAtIndex(Book book, int index) {
        if (index < 0 || index > books.size()) {
            throw new BookIndexOutOfLimits("That book index is out of limits");
        }
        books.add(index, book);

    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Book getBookAt(int index) {
        if (index < 0 || index >= books.size()) {
            throw new BookIndexOutOfLimits("That book index is out of limits");
        }
        return books.get(index);

    }

    public boolean lookIfBookExist(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public void removeBookByTitle(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                return;
            }
        }
    }
}
