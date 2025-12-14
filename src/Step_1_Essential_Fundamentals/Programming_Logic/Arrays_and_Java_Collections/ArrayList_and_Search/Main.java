package Step_1_Essential_Fundamentals.Programming_Logic.Arrays_and_Java_Collections.ArrayList_and_Search;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ana");
        names.add("Bruno");
        names.add("Carlos");
        names.add("Daniela");
        names.add("Eduardo");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String findName = scanner.nextLine();

        boolean nameFound = false;
        for(String name : names){
            if(name.equals(findName)){
                System.out.println("Name found");
                nameFound = true;
                break;
            }
        }
        if(!nameFound){
            System.out.println("Name doest exist");
        }


    }
}
