package challenges.strings.groupanagrams;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] listOfWords = new String[]{"act","pots","tops","cat","stop","hat"};
        List<List<String>> groupdAnagrams = new Solution().groupAnagrams(listOfWords);
        System.out.println(groupdAnagrams);
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramGroup = new HashMap<>();

        for(String str: strs) {
            // That array will be used to store each char counting from current str.
            int[] charCounting = new int[26];
            // To do that we need to see every single char in str, and store it in our anagramGroup.
            for(char c : str.toCharArray()) {
                /* ASCII maintains lowercase chars in
                   non-decreasing order we can use that as a tool to store a..z using numbers 0 to 26 by performing
                    current char - 'a', since that java returns int when we do operations with chars, if char is equal
                    a that operation will return 0, if b returs 1 and so on.
                    Since default values in java to int is 0(in case of arrays), each position will be 0 so all we need to do is
                    to increment their value.
                */
                charCounting[c - 'a'] += 1;
            }
            /*
                Since char counting contains the counting of each char for A to Z within str, we can just transform
                that array in string to be used as key in our commum
             */
            String key = Arrays.toString(charCounting);

            // if it's the first time that some character appears in the string, we need to initialize current array.
            // Arrays.toString(teste) is used to create a string to be compared with
            anagramGroup.putIfAbsent(key, new ArrayList<>());

            // whatever is just created or not, eu will add this current string to the array
            anagramGroup.get(key).add(str);
        }

        return new ArrayList<>(anagramGroup.values());
    }

}
