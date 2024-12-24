package JAVA.collectionsLearning.collectionUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Exercise 1: Sorting with Arrays.sort

        int[] list = new int[] { 12, 7, 19, 3, 8, 21, 5 };
        System.out.println("Before sorting: " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("After sorting in ascending order: " + Arrays.toString(list));
        Integer[] listInt = Arrays.stream(list).boxed().toArray(Integer[]::new);
        Arrays.sort(listInt, Collections.reverseOrder());
        System.out.println("After sorting in descending order: " + Arrays.toString(listInt));

        // Exercise 2: Filling an Array with Arrays.fill
        int[] arrayToFill = new int[10];
        Arrays.fill(arrayToFill, 5);
        System.out.println("Array after filled with 5: " + Arrays.toString(arrayToFill));
        Arrays.fill(arrayToFill, 2, 6, 10);
        System.out.println("Array after filled with value 10 from 2 to 6: " + Arrays.toString(arrayToFill));

        // Exercise 3: Copying an Array with Arrays.copyOf
        int[] arrayToCopy = new int[] { 10, 20, 30, 40, 50 };
        System.out.println("Array before: " + Arrays.toString(arrayToCopy));
        int[] copiedArray = Arrays.copyOf(arrayToCopy, arrayToCopy.length);
        System.out.println("Array after: " + Arrays.toString(copiedArray));
        System.out.println(
                "Array after range copy: " + Arrays.toString(Arrays.copyOfRange(arrayToCopy, 2, arrayToCopy.length)));
        System.out.println("Array after extended range copy: "
                + Arrays.toString(Arrays.copyOf(arrayToCopy, arrayToCopy.length + 3)));

        // Exercise 4: Using Arrays.binarySearch
        int[] arrayForBinarySearch = new int[] { 10, 20, 30, 40, 50 };
        System.out.println("Binary search index: " + Arrays.binarySearch(arrayForBinarySearch, 40));

        // Exercise 5: Using Collections.frequency
        List<Integer> arrayForFrequency = new ArrayList<>(Arrays.asList(10, 20, 20, 30, 10, 40));
        System.out.println("Frequency of 20: " + Collections.frequency(arrayForFrequency, 20));

        // Exercise 6: Using Collections.sort
        List<Integer> arrayToSort = new ArrayList<>(Arrays.asList(30, 10, 50, 20, 40));
        System.out.println("Array before sort: " + arrayToSort);
        Collections.sort(arrayToSort);
        System.out.println("Array after sorting in ascending order: " + arrayToSort);
        Collections.sort(arrayToSort, (a, b) -> b - a);
        System.out.println("Array after sorting in descending order: " + arrayToSort);

        //Exercise 7: Using Collections.reverse
        System.out.println("Original list:" + arrayToSort);
        Collections.reverse(arrayToSort);
        System.out.println("Reversed list:" + arrayToSort);

        //Exercise 8: Using Collections.shuffle
        System.out.println("Original List: " + arrayToSort);
        Collections.shuffle(arrayToSort);
        System.out.println("Shuffled List: " + arrayToSort);
        Collections.shuffle(arrayToSort);
        System.out.println("Shuffled Again: " + arrayToSort);

        //Exercise 9: Using Collections.min and Collections.max
        System.out.println("Minimum in listArray: " + Collections.min(arrayToSort));
        System.out.println("Maximum in listArray: " + Collections.max(arrayToSort));

        //Exercise 10: Using Collections.swap
        System.out.println("Original List: " + arrayToSort);
        Collections.swap(arrayToSort, 0, arrayToSort.size() - 1);
        System.out.println("After swap of first and last digit: " + arrayToSort);

        //Exercise 11: Using Collections.rotate
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original List: " + numbers);
        Collections.rotate(numbers, 2);
        System.out.println("List after rotating by 2 positions: " + numbers);
        Collections.rotate(numbers, -2);
        System.out.println("List after rotating by -2 positions: " + numbers);

        //Exercise 12: Using Collections.fill
        System.out.println("Original List: " + numbers);
        Collections.fill(numbers, 10);
        System.out.println("List after filling with 10: " + numbers);
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        Collections.fill(fruits, "fruit");
        System.out.println("String List after filling with 'fruit': " + fruits);
    

        

    }
}
