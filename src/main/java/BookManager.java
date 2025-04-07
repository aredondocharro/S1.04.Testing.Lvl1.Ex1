class BookManager {
    public static Library library = new Library();
    public static Library initializeLibrary() {
        library.addBook(new Book("The Neverending Story"));
        library.addBook(new Book("The Little Prince"));
        library.addBook(new Book("The Hunger Games"));
        library.addBook(new Book("Blackwater"));
        library.addBook(new Book("Harry Potter and the Philosopher's Stone"));
        return library;
    }

}

