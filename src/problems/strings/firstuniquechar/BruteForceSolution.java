package problems.strings.firstuniquechar;

import java.util.HashMap;

public class BruteForceSolution {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> teste = new HashMap();

        for(int i = 0; i < s.length(); i++) {
            teste.put(s.charAt(i), teste.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0 ; i < s.length(); i++) {
            if(teste.containsKey(s.charAt(i))) {
                int val = teste.get(s.charAt(i));
                if(val == 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
