package Step_1_Essential_Fundamentals.Programming_Logic.Repetitive_Structures.Reverse_Multiplication_Table_Generator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; //this is general, works for "do" and "while" at the same time

        do{
            System.out.println("Enter a number between 0 and 10");
            n = scanner.nextInt(); // int n = scanner.nextInt(); this works only for "do"
            if(n < 0 || n > 10){
                System.out.println("Number not accept");
            }else{
                for(int i = 10; i > 0; i--){
                    System.out.println(n + "x" + i + "=" + (n * i));
                }
            }

        } while(n < 0 || n > 10);

        scanner.close();
    }
}
