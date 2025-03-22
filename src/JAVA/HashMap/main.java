package JAVA.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // using for each with entry set
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // using for each with key set, keys only
        for (String keySet : map.keySet()) {
            System.out.println("Key:" + keySet);
        }

        // using for each with key set, keys only
        for (Integer value : map.values()) {
            System.out.println("Value:" + value);
        }
    }
}
