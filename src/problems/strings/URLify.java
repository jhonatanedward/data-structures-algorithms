package problems.strings;

public class URLify {
    public static void main(String[] args) {
        String borala = "Mr John Smith    ";
        alter(borala.toCharArray(), getTrueLength(borala));
    }

    public static int getTrueLength(String str) {
        int bora = str.length() - 1;
        while(str.charAt(bora) == ' ' && bora >= 0) {
            bora--;
        }
        return bora + 1;
    }

    public static void alter(char[] str, int trueLength) {
        int numberOfSpaces = 0;
        for(int i = 0; i < trueLength; i++) {
            numberOfSpaces += 1;
        }

        
    }
}
