package LLD.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(10);

        // Adding elements
        map.put("Ella", 25);
        map.put("John", 30);
        map.put("Mike", 35);
        map.put("Ella", 28); // Update test

        // Retrieve elements
        System.out.println("Ella's age: " + map.getValue("Ella")); // 28
        System.out.println("John's age: " + map.getValue("John")); // 30

        // Remove an element
        map.remove("John");
        System.out.println("John's age after removal: " + map.getValue("John")); // null

        // Check size
        System.out.println("Size of map: " + map.size()); // 2
    }
}
