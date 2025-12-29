package Step_1_Essential_Fundamentals.Additional_Java_Core.Data_Structures_Basic;

import java.util.ArrayList;
import java.util.logging.StreamHandler;

public class Task_Manager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Run");
        tasks.add("Walking with the dog");
        tasks.add("Sleep");

        tasks.remove(0);

        for(String item : tasks){
            System.out.println(item);
        }

    }
}
