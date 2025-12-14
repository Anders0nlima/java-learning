package Step_1_Essential_Fundamentals.Programming_Logic.Repetitive_Structures.Input_Adder_with_Sentinel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a value: ");
        int value = scanner.nextInt();

        int valueSum = 0;
        while (value != 0){
            valueSum += value;
            System.out.println("enter a value[0 to exit]: ");
            value = scanner.nextInt();
        }
        System.out.println("The total sum is "+valueSum);

        scanner.close();
    }
}
