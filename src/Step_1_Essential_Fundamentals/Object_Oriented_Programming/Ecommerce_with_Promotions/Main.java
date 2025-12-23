package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Ecommerce_with_Promotions;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product1 = new Book("Pride and Prejudice", 20.0);
        Product product2 = new Electronics("Laptop", 3000.0);
        Product product3 = new Food("Pizza", 10.0);

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);


        shoppingCart.checkout(0.15);

    }
}
