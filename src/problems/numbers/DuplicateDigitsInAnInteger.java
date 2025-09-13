package problems.numbers;


import java.util.Stack;

public class DuplicateDigitsInAnInteger {
    public static void main(String[] args) {
        new DuplicateDigitsInAnInteger().solutionUsingStack(1234 );
    }

    public int solutionUsingStack(int n) {
        Stack<Integer> allDigits =  new java.util.Stack<>();

        while(n > 0) {
            allDigits.push(n % 10);
            allDigits.push(n % 10);
            n = n / 10;
        }

        int res = 0;
        while(!allDigits.isEmpty()) {
            res = res * 10 + allDigits.pop();
        }

        return res;
    }




    public int solution(int n ) {

        int initial = 0;
        while(n > 0) {
            int d = n % 10;
            int duplicado = d * 10 + d;
            initial = initial * 100 + duplicado;
            n /= 10;
        }

        int res = 0;
        while(initial > 0) {
            int d = initial % 100;
            res = res * 100 + d;
            initial = initial / 100;
        }

        return res;
    }
}
