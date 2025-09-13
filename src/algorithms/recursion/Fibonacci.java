package algorithms.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacciNumberFor(3);
    }

    public static int fibonacciNumberFor(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciNumberFor(n - 1) + fibonacciNumberFor( n - 2);
    }
}
