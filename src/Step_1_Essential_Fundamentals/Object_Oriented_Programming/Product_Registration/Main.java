package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Product_Registration;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("computer");
        product.setPrice(4000);
        product.setQuantityInStock(30);

        System.out.println(product.calculateTotalValue());

    }
}
