package Step_1_Essential_Fundamentals.Programming_Logic.Sequential_Structures.Temperature_Converter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Temperature: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("User Input: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
