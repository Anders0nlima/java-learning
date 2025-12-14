package Step_1_Essential_Fundamentals.Programming_Logic.Arrays_and_Java_Collections.Filtering_and_Counting;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> bigNumbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(8);
        numbers.add(22);
        numbers.add(5);
        numbers.add(30);
        numbers.add(10);
        numbers.add(4);
        numbers.add(17);

        for(int num : numbers){
            if(num > 10 && num%2 == 0){
                bigNumbers.add(num);
            }
        }

        int size = bigNumbers.size();
        System.out.println("Number of large even numbers: " + size);
        System.out.println("Numbers found: " + bigNumbers);

    }
}
