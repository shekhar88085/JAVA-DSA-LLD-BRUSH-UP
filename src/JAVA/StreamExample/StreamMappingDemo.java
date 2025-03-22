package JAVA.StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingDemo {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        System.out.println("List: " + myList);

        List<Double> sqrList = myList.stream()
                .map((n) -> n * n)
                .collect(Collectors.toList());

                System.out.println("Squyare List: " + sqrList);
    }
}
