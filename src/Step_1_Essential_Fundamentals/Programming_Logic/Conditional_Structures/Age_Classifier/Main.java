package Step_1_Essential_Fundamentals.Programming_Logic.Conditional_Structures.Age_Classifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your Age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You are minor");
        } else{
            System.out.println("Your are legal age");
        }

        scanner.close();
    }
}
