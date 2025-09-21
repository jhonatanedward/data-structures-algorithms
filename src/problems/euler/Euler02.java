package problems.euler;

public class Euler02 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int total = 0;
        while(a < 4000000) {
            total += a;
            int temp = b;
            b = (4 * b)  + a;
            a = temp;
        }
        System.out.println(total);
    }
}
