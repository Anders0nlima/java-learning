package Step_1_Essential_Fundamentals.Additional_Java_Core.Data_Structures_Basic;

import java.util.HashMap;
import java.util.Scanner;

public class The_Price_Dictionary {
    public static void main(String[] args) {
        HashMap<String, Double> product = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        product.put("book", 100.0);
        product.put("pen", 10.0);
        product.put("bottle", 56.0);
        product.put("computer", 1500.0);

        System.out.print("What you looking for? ");
        String find = scanner.nextLine().toLowerCase();

        if (product.containsKey(find)){
            Double price = product.get(find);
            System.out.println("The price of " + find + " is " + price);
        } else{
            System.out.println("We don't have :(");
        }


        scanner.close();
    }
}
