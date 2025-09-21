package problems.euler;

public class Euler03 {

    // Largest Prime Factor

    public static void main(String[] args) {
        long num = 600851475143L;
        long sqrt = (long) Math.sqrt(num) + 1;
        long found = 0;
        for(long i = sqrt; i > 0; i--) {
            if(num % i == 0 && isPrime(i)) {
                found = i;
                break;
            }
        }
        System.out.println(found);
    }

    public static boolean isPrime(long num) {
        if(num <= 1) return false;

        long sqrt = (long) Math.sqrt(num) + 1;

        for(int i = 2; i < sqrt; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
