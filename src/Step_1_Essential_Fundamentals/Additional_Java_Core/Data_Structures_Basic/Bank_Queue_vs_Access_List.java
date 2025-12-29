package Step_1_Essential_Fundamentals.Additional_Java_Core.Data_Structures_Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bank_Queue_vs_Access_List {
    public static void main(String[] args) {
        int totalElements = 100_000;
        int removals = 5_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < totalElements; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startArray = System.nanoTime();
        for (int i = 0; i < removals; i++) {
            arrayList.remove(0);
        }
        long endArray = System.nanoTime();
        long tempoArray = (endArray - startArray) / 1_000_000;

        long startLinked = System.nanoTime();
        for (int i = 0; i < removals; i++) {
            linkedList.remove(0);
        }
        long endLinked = System.nanoTime();
        long tempoLinked = (endLinked - startLinked) / 1_000_000;


        System.out.println("Time ArrayList: " + tempoArray + " ms"); // 48 ms
        System.out.println("Time LinkedList: " + tempoLinked + " ms"); // 0 ms

        //ArrayList: Imagine a row of chairs attached to each other.
        //If you remove the first person, all the other chairs have to be
        //moved one place forward to fill the gap. If the list has 100,000 items,
        //Java makes 100,000 moves with each removal!
        //LinkedList: Imagine people holding hands. If the first person leaves,
        //the second person simply raises their hand and says, "Now I'm first."
        //No one else needs to move. It's a constant-cost operation.
    }
}
