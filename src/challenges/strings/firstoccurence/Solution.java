package challenges.strings.firstoccurence;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().strStr("a", "a"));
    }
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length() + 1 - needle.length(); i++) {
            for(int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

                if(j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}