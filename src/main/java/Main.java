import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Library library = BookManager.initializeLibrary();

        System.out.println("-----List of books-----");
        library.getBooks().forEach(System.out::println);

        library.addBookAtIndex(new Book("Moby Dick [We add this book at position 3]"), 2);

        System.out.println("\nBook at position 3: " + library.getBookAt(2));

        System.out.println("\nLook if 'Moonlight' book exist: " + library.lookIfBookExist("Moonlight"));
        System.out.println("\nLook if 'The Hunger Games' book exist: " + library.lookIfBookExist("The Hunger Games"));

        System.out.println("\nAdding new books. 'The Little Prince' that already exist and 'Dracula'");
        library.addBook(new Book("The Little Prince"));
        library.addBook(new Book("Dracula"));


        System.out.println("\nRemoving 'Blackwater'");

        library.removeBookByTitle("Blackwater");

        System.out.println("\n-----New list of books-----");
        library.getBooks().forEach(System.out::println);
    }
}