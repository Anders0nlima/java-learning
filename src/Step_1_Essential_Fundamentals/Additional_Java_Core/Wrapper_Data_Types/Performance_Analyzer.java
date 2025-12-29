package Step_1_Essential_Fundamentals.Additional_Java_Core.Wrapper_Data_Types;

public class Performance_Analyzer {
    public static void main(String[] args) {
        int interactions = 100_000_000;

        long beginInt = System.currentTimeMillis();
        long sumInt = 0;
        for(int i = 0; i < interactions; i++){
            sumInt += i;
        }
        long endInt = System.currentTimeMillis();
        System.out.println("Time with int: " + (beginInt - endInt) + " ms"); // -2


        long beginInteger = System.currentTimeMillis();
        long sumInteger = 0;
        for(Integer j = 0; j < interactions; j++){
            sumInteger += j;
        }
        long endInteger = System.currentTimeMillis();
        System.out.println("Time with Integer: " + (beginInteger - endInteger) + " ms"); // -398 (Unboxing / Autoboxing)
    }
}
