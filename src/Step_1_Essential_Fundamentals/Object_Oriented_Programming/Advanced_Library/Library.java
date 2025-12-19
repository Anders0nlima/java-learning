package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Advanced_Library;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item){
        items.add(item);
    }

    public void showFine(LibraryItem item, int days){
        double fine = item.calculateFine(days);
        System.out.println("Itens: " + item.getTitle() + " | Days late: " + days +" | Fine: " + fine);
    }

}
