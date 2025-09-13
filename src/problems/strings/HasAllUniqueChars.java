package problems.strings;

public class HasAllUniqueChars {

    public static void main(String[] args) {
        System.out.println(check("!!ab"));
    }

    public static boolean check(String sb) {
        if(sb.length() > 128) return false;
        int[] allASCII = new int[128];

        for(char c : sb.toCharArray()) {
            allASCII[c] += 1;
        }

        for(int i = 0; i < allASCII.length; i++) {
            if(allASCII[i] > 1) {
                return false;
            }
        }

        return true;
    }
}
