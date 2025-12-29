package Step_1_Essential_Fundamentals.Additional_Java_Core.Introduction_to_the_Stream_API.Data_Transformation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Cafe", 51.80);
        Product product2 = new Product("Headset", 40);
        Product product3 = new Product("Book", 7);
        Product product4 = new Product("Plant", 54.5);
        Product product5 = new Product("Pen", 75.5);

        ArrayList<Product> list = new ArrayList<>();

        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);


        list.stream()
                .filter(product -> product.getPrice() > 50)
                .map(Product::getName)
                .forEach(System.out::println);

    }
}
