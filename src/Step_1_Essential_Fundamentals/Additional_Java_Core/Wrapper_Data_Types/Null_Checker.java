package Step_1_Essential_Fundamentals.Additional_Java_Core.Wrapper_Data_Types;


import java.util.Scanner;

public class Null_Checker {

    public static void main(String[] args) {
        System.out.println("value(5): "+ checker(5));
        System.out.println("value(null): " + checker(null));
    }

    public static Integer checker(Integer num){
        if (num == null){
            return 0;
        }
        return num * 2;
    }

}
