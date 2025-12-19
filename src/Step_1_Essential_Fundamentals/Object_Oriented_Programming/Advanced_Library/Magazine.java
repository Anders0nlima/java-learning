package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Advanced_Library;


public class Magazine extends LibraryItem{
    protected int edition;

    public Magazine(String title, int yearOfPublication, int edition){
        super(title, yearOfPublication);
        this.edition = edition;
    }

    @Override
    public double calculateFine(int daysDelay) {
        return daysDelay * 1.0;
    }
}
