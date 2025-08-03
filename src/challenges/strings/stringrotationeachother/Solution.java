package challenges.strings.stringrotationeachother;

public class Solution {
    public static void main(String[] args) {
        String  s1 = "mightandmagic", s2 = "andmagicmigth";
        booleanRotateString(s1, s2);
    }

    public static boolean booleanRotateString(String s1, String s2) {
        if(s2.length() != s2.length()) return false;
        String allRotation = s1 + s1;
        return allRotation.contains(s2);
    }

    // Brute force approach
    public static boolean rotateStringBruteForce(String s, String goal) {
        if(s.equals(goal)) return true;

        char[] s1CharArray = s.toCharArray();

        for(int i = 1; i < s1CharArray.length; i++) {

            for(int j = 0; j < s1CharArray.length - 1; j++) {
                char temp = s1CharArray[j];
                s1CharArray[j] = s1CharArray[j + 1];
                s1CharArray[j + 1] = temp;
            }

            if(String.valueOf(s1CharArray).equals(goal)) return true;

        }

        return false;
    }
}
