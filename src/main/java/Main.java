public class Main {
    public static void main(String[] args) {
        Library library = BookManager.initializeLibrary();

        System.out.println("-----List of books-----");
        library.getBooks().forEach(System.out::println);
        try {
            library.addBookAtIndex(new Book("Moby Dick [We add this book at position 3]"), 2);
        } catch (BookIndexOutOfLimits e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("\nBook at position 3: " + library.getBookAt(2));
        } catch (BookIndexOutOfLimits e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nLook if 'Moonlight' book exists: " + library.lookIfBookExist("Moonlight"));
        System.out.println("\nLook if 'The Hunger Games' book exists: " + library.lookIfBookExist("The Hunger Games"));

        System.out.println("\nAdding new books. 'The Little Prince' that already exists and 'Dracula'");

        library.addBook(new Book("The Little Prince")); // Esto lanzará excepción
        library.addBook(new Book("Dracula"));

        System.out.println("\nRemoving 'Blackwater'");
        library.removeBookByTitle("Blackwater");

        System.out.println("\n-----New list of books-----");
        library.getBooks().forEach(System.out::println);

    }
}