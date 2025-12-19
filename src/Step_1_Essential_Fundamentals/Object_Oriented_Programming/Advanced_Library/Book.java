package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Advanced_Library;

public class Book extends LibraryItem{
    private String author;

    public Book(String title, int yearOfPublication, String author){
        super(title, yearOfPublication);
        this.author = author;
    }

    @Override
    public double calculateFine(int daysDelay) {
        return daysDelay * 0.5;
    }
}
