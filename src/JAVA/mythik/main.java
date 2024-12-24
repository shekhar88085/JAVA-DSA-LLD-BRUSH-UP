package JAVA.mythik;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        System.out.println("fghjkl");
        System.out.println(isAnangram("anagram", "naagaram").toString());
    }

    static Boolean isAnangram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // create map
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int i = map.getOrDefault(c, 0);
            map.put(c, i + 1);
        }
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            int i = map.get(c);
            if (i == -1) {
                return false;
            }
            map.put(c, i - 1);
        }
        return true;
    }
}