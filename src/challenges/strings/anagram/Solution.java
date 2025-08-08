package challenges.strings.anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> compute = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()) {
            compute.put(c, compute.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            compute.put(c, compute.getOrDefault(c, 0) - 1);
        }

        for(Map.Entry<Character, Integer> entry : compute.entrySet()) {
            if(entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
