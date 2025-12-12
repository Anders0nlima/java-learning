package Step_1_Essential_Fundamentals.Programming_Logic.Conditional_Structures.Grade_Sorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your Grade[0-100]: ");
        int grade = scanner.nextInt();

        String status = (grade >= 70) ? "approved" : "Flunk"; //Ternary Operator;
        System.out.println(status);

        int gradeConcept = grade/10;

        switch (gradeConcept){

            case 10:
            case 9:
                System.out.println("Concept A");
                break;
            case 8:
                System.out.println("Concept B");
                break;
            case 7:
                System.out.println("Concept C");
                break;
            case 6:
                System.out.println("Concept D");
                break;
            default:
                System.out.println("Concept F");
                break;
        }

        scanner.close();
    }
}
