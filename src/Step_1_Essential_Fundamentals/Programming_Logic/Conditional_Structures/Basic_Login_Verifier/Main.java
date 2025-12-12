package Step_1_Essential_Fundamentals.Programming_Logic.Conditional_Structures.Basic_Login_Verifier;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int password = 12345;
        String username = "admin";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Username: ");
        String userUsername = scanner.nextLine();

        System.out.println("Your Password: ");
        int userPassword = scanner.nextInt();

        //Use the ".equals" operator to compare strings.
        if (username.equals(userUsername) && password == userPassword) {
            System.out.println("Login successful. Welcome!");
        }else{
            System.out.println("Error: Invalid username or password");
        }

        scanner.close();
    }
}
