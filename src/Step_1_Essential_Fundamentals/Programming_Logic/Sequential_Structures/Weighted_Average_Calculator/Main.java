package Step_1_Essential_Fundamentals.Programming_Logic.Sequential_Structures.Weighted_Average_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weighted1 = 2.0;
        double weighted2 = 3.0;
        double weighted3 = 5.0;

        System.out.println("Grade 1: ");
        int grade1 = scanner.nextInt();

        System.out.println("Grade 2: ");
        int grade2 = scanner.nextInt();

        System.out.println("Grade 3: ");
        int grade3 = scanner.nextInt();

        double weighted_average = ((grade1 * weighted1) + (grade2 * weighted2) + (grade3 * weighted3))/(weighted1 +weighted2 + weighted3);

        System.out.println(weighted_average);

        scanner.close();
    }
}
