package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Ecommerce_with_Promotions;

public class Electronics extends Product implements Promotional{
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount(double percentage) {
        double discountedPrice = getPrice() * (1 - percentage);
        if(discountedPrice >= 100.0){
            return discountedPrice;
        } else{
            System.out.println("Discount not applicable for " + getName() + ": Price would drop below $100.");
            return getPrice();
        }
    }
}
