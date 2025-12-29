package Step_1_Essential_Fundamentals.Additional_Java_Core.Introduction_to_the_Stream_API;


import java.util.Arrays;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SalesStatistics {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
                82,42,82,76,92,96,86,8,86,47,
                35,73,70,37,82,54,56,25,59,50,
                59,20,64,35,43,24,42,46,9,66,
                13,92,52,35,44,66,56,78,8,97);

        IntSummaryStatistics stats = list.stream()
                        .collect(Collectors.summarizingInt(n -> n));

        System.out.println("Sales Report:");
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Sales Quantity " + stats.getCount());

    }
}
