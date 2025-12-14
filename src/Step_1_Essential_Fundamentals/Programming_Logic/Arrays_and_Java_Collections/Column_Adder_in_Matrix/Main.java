package Step_1_Essential_Fundamentals.Programming_Logic.Arrays_and_Java_Collections.Column_Adder_in_Matrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];

        matrix[0][0] = 1; //column 1
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5; //column 1
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;
        matrix[2][0] = 9; //column 1
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;

        for(int i = 0; i < matrix[0].length; i++){
            int sumColumn = 0;
            for(int j = 0; j < matrix.length; j++){
                sumColumn += matrix[j][i];
            }
            System.out.println(sumColumn);
        }

    }
}
