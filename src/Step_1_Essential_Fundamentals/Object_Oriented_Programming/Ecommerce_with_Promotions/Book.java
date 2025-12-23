package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Ecommerce_with_Promotions;

public class Book extends Product implements Promotional{

    public Book(String name, double price){
        super(name, price);
    }


    @Override
    public double applyDiscount(double percentage) {
        double totalDiscount = percentage + 0.1;
        return getPrice() * (1 - totalDiscount);
    }

}
