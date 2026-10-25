package stringExample;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
    public static void main(String[] args) {
        String input = "programming";

        // Map to store character as key and its count as value
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to char array and iterate
        for (char c : input.toCharArray()) {
            // getOrDefault assigns 0 if the character is new, then adds 1
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the character frequencies
        System.out.println("Character Occurrences: " + charCountMap);
    }
}
