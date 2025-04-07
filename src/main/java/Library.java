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
        } else {
            System.out.println(book + " already exist.");
        }

    }

    public void addBookAtIndex(Book book, int index) {
        if (index >= 0 && index <= books.size()) {
            books.add(index, book);
        } else {
            System.out.println("Index out of range.");
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Book getBookAt(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        System.out.println("Index out of range.");
        return null;
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
                System.out.println("Book " + title + " removed successfully.");
                return;
            }
        }
        System.out.println("Book " + title + " not found in the library.");
    }

}
