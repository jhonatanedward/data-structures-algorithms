package problems.strings.encode_decode_strings;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> toEncode = List.of("we","say",":","yes");
        String encodedString = solution.encode(toEncode);
        System.out.println(encodedString);
        List<String> decoded = solution.decode(encodedString);
    }

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            /* that solution works, just because we're not using characters as separator, instead we are prefixing each
               string with their lenght, it is safe even if the string contains # just because when we get their length,
               we will split it without take care about that # into it.
             */
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            Integer strLength = Integer.parseInt(str.substring(i, j));
            String strToAdd = str.substring(j + 1, j + 1 + strLength);
            i = j + 1 + strLength;
            decodedString.add(strToAdd);
        }
        return decodedString;
    }
}
