package challenges.numbers;

public class MultiplyEvenDigitsOfInteger {

    /*
        You are given an integer n where n ranges from 1 to 10000000 inclusive. Your task is to write a function that
        calculates and returns the product of the odd digits of n, without converting n into a string.
        For example, if n equals 43172, the output should be 21, because the product of the odd digits 3, 1, and 7 is 21.
        Please note that if n has no odd digits, your function should return 0.
        You are expected to solve this task by using a while loop. Good luck!
     */
    public static void main(String[] args) {
        System.out.println(solution(43172)); // should return 3x1x7 = 21
        System.out.println(solution(1)); // should return 1;
        System.out.println(solution(46824)); // should return 0;
    }

    public static int solution(int n) {
        int sum = 1;
        boolean founded = false;
        while(n > 0) {
            int rest = n % 10;
            if(rest % 2 != 0) {
                founded = true;
                sum *= rest;
            }
            n = n / 10;
        }
        if(founded) {
            return sum;
        }else {
            return 0;
        }
    }
}
