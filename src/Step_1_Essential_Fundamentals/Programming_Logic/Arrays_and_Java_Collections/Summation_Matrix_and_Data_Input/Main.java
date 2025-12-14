package Step_1_Essential_Fundamentals.Programming_Logic.Arrays_and_Java_Collections.Summation_Matrix_and_Data_Input;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][3];

        int totalSum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println("Positions[" + i + "][" + j + "]");
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                totalSum += matrix[i][j];
            }
        }

        System.out.println(totalSum);
        scanner.close();
    }
}
