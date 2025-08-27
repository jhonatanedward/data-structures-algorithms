package problems.strings.atoi;

public class Solution {
    /*
        ASCII to Integer (atoi)
     */
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.myAtoi("-0123");
    }

    public int myAtoi(String s) {
        int sign = 1, res = 0, idx = 0;

        // ignoring leading whitespaces.
        while (idx < s.length() && s.charAt(idx) == ' ') idx++;

        if(idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            /*
             In the next line idx++ will pass the current idx for the charAt function and increment idx
             to be used in the next step to start convert to integer.
             */
            sign = s.charAt(idx++) == '-' ? -1 : 1;
        }

        /*
            Verify ascII table to see if the current char is a number.
         */
        while(idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {

            // Checa overflow antes de multiplicar por 10 e somar o próximo dígito
            // Evita overflow no próximo passo
            if(res > Integer.MAX_VALUE / 10 ||
            (res == Integer.MAX_VALUE / 10 && s.charAt(idx) > '7')) {
                return sign ==  1 ? 2147483647 : -2147483648;
            }

            res = res * 10 + (s.charAt(idx) - '0');
            idx++;
        }

        return res * sign;
    }
}
