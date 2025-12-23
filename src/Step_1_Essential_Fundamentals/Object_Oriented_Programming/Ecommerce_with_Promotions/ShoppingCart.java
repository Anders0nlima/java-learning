package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Ecommerce_with_Promotions;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product item){
        items.add(item);
    }

    public void checkout(double couponPercentage){
        double totalToPay = 0.0;
        double originalTotal = 0.0;

        for(Product p : items){
            originalTotal += p.getPrice();
            if(p instanceof Promotional){
                Promotional promoItem = (Promotional) p;
                totalToPay += promoItem.applyDiscount(couponPercentage);
            } else{
                totalToPay += p.getPrice();
            }
        }

        double saved = originalTotal - totalToPay;
        System.out.println("Final total: " + totalToPay);
        System.out.println("You saved: " + saved);
    }

}
