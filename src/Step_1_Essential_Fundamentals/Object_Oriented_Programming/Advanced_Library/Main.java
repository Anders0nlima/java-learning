package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Advanced_Library;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        Book book1 = new Book("Dom Casmurro", 1899, "Machado de Assis");
        Magazine magazine1 = new Magazine("Java World", 2023, 21);

        myLibrary.addItem(book1);
        myLibrary.addItem(magazine1);

        myLibrary.showFine(book1, 10);
        myLibrary.showFine(magazine1, 10);
    }
}
