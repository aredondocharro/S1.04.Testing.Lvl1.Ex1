class BookManager {
    public static Library initializeLibrary(){
        Library libraryInit = new Library();
        libraryInit.addBook(new Book("The Neverending Story"));
        libraryInit.addBook(new Book("The Little Prince"));
        libraryInit.addBook(new Book("The Hunger Games"));
        libraryInit.addBook(new Book("Blackwater"));
        libraryInit.addBook(new Book("Harry Potter and the Philosopher's Stone"));
        return libraryInit;
    }


}

