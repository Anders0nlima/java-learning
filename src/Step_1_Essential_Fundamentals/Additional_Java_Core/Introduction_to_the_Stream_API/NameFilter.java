package Step_1_Essential_Fundamentals.Additional_Java_Core.Introduction_to_the_Stream_API;

import java.util.Arrays;
import java.util.List;

public class NameFilter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ana", "Bruno","Amanda", "Carlos");

//        for(String item : list){
//            if (item.startsWith("A")){
//                System.out.println(item);
//            }
//        }

        list.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
