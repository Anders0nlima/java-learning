package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Advanced_Library;

public abstract class LibraryItem {
    protected String title;
    protected int yearOfPublication;

    public LibraryItem(String title, int yearOfPublication){
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public abstract double calculateFine(int daysDelay);

    public String getTitle(){
        return title;
    }
}
