package Step_1_Essential_Fundamentals.Additional_Java_Core.Wrapper_Data_Types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class The_String_Converter {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<String> list = new ArrayList<>();
//        String choice;
//
//        do{
//            System.out.println("Add a string value to the list: ");
//            String value = scanner.nextLine();
//            list.add(value);
//
//            System.out.println("Current List: " + list);
//
//            System.out.println("Exit: 0 | Continue: 1");
//            choice = scanner.nextLine();
//
//        } while (!choice.equals("0"));
//
//        System.out.println("full list" + list);
//
//
//        double sumList = 0;
//
//        for(String value : list){
//            Double num = Double.valueOf(value);
//
//            sumList += num;
//        }
//
//        System.out.println(sumList);
//
//        scanner.close();
//
//    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "6.4", "9.3");

        double sumList = 0.0;

        for(String s : list){
            Double numWrapper = Double.valueOf(s);

            sumList += numWrapper;

            System.out.println("As Double: " + numWrapper);
        }

        System.out.println("List sum: " + sumList);
    }
}
