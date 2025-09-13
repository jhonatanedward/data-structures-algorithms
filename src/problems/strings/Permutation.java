package problems.strings;

import java.util.HashMap;

public class Permutation {

    public static void main(String[] args) {
        System.out.println(checkPermutation("applee", "papel"));
    }

    public static boolean checkPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int[] allChars = new int[128];

        for(char c : s1.toCharArray()) {
            allChars[c] += 1;
        }

        for(char c : s1.toCharArray()) {
            allChars[c] -= 1;
            if(allChars[c] < 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean check(String sb, String sb1) {
        HashMap<Character, Integer> result = new HashMap<>();

        for(char c: sb.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }

        for(char c: sb.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) - 1);
        }

        for(Integer in : result.values()) {
            if(in > 0 ) {
                return false;
            }
        }

        return true;
    }
}
