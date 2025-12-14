package Step_1_Essential_Fundamentals.Programming_Logic.Arrays_and_Java_Collections.Vector_Inverter;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 40, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //--- or

        //for (int number : numbers) {
        //    System.out.println(number);
        //}

        //--- or in decrease
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }


    }
}
