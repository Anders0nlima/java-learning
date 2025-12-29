package Step_1_Essential_Fundamentals.Additional_Java_Core.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        System.out.println("division calculator");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("numerator: ");
            int numerator = scanner.nextInt();

            System.out.println("denominator: ");
            int denominator = scanner.nextInt();

            int division = numerator/denominator;
            System.out.println(division);
        }catch (ArithmeticException e){
            System.out.println("Sorry, but the denominator can't be 0");
        }catch (InputMismatchException i){
            System.out.println("Sorry, but you can't input a letter or character");
        } finally {
            scanner.close();
        }
    }
}
