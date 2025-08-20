package euler;

public class Euler04 {
    public static void main(String[] args) {
        int max = 0;
        for(int i = 999; i > 100; i--) {
            for(int j = i; j < 1000; j++) {
                int calc = i * j;
                if(isPalindrome(calc)) {
                    max = Math.max(calc, max);
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isPalindrome(Integer num) {
        char[] chars = String.valueOf(num).toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while(i < j) {
            if(chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
