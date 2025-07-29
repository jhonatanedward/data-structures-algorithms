package challenges.strings.firstuniquechar;

public class BetterSolution {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        int count[] = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++; //  count letters
        }
        int i = 0;
        for (char c : s.toCharArray()) {
            if (count[c - 'a'] == 1) return i; //  found first unique
            i++;
        }
        return -1; //  no unique found
    }
}
