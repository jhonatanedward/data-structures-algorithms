package problems.euler;

public class Euler05 {

    public static void main(String[] args) {
        long result = 1;

        for(long i = 2; i <=20; i++) {
            result = mmc(result, i);
        }

        System.out.println(result);
    }

    public static long mmc(long a, long b) {
        return (a * b) / mdc(a, b);
    }

    public static long mdc(long a, long b) {
        if(b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    public static void bruteForceApproach(int num) {
        for(int i = 1; ;i++) {
            boolean isThis = true;
            for(int j = 1; j < 20; j++) {
                if(i % j != 0) {
                    isThis = false;
                    break;
                }
            }

            if(isThis) {
                System.out.println(i);
                break;
            }

        }
    }
}
