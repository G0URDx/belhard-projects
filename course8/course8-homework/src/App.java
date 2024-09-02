public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();

        // Add all books
        library.addBook(new Book("Дикая охота короля Стаха", "Короткевич", 1964));
        library.addBook(new Book("Мастер и Маргарита", "Булгаков", 1940));
        library.addBook(new Book("Маленький принц", "Сент-Экзюпери", 1943));

        // Print all books
        library.printAllBooks();

        // Find by title
        System.out.println("\n" + library.findBookByTitle("Мастер и Маргарита"));

        // Remove by title
        library.removeBook("Дикая охота короля Стаха");
        System.out.println("");
        library.printAllBooks();

        // LibraryTest libraryTest = new LibraryTest();
        // libraryTest.addBook(new Book("Дикая охота короля Стаха", "Короткевич",
        // 1964));
        // libraryTest.addBook(new Book("Мастер и Маргарита", "Булгаков", 1940));
        // libraryTest.addBook(new Book("Маленький принц", "Сент-Экзюпери", 1943));
        // System.out.println("");
        // System.out.println(libraryTest.printOldestBookByYear(1900));
    }
}
