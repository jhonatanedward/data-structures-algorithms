package problems.euler;

public class Euler07 {

    public static void main(String[] args) {
        // 10001st Prime
        int i = 3;
        int count = 1;
        while(count < 10001) {
            if((i % 2 != 0) && isPrimeNumber(i)) {
                count++;
            }
            i++;
        }

        System.out.println(--i);
    }

    public static boolean isPrimeNumber(int num) {
        if(num <= 1) return false;

        int sqrt = (int) Math.sqrt(num) + 1;

        for(int i = 2; i < sqrt; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
