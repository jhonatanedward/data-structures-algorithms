package problems.numbers;

public class CountConsecutives {

    public static void main(String[] args) {
        CountConsecutives.Solution(444);
    }

    public static int Solution(int n) {
        int count = 0;
        while (n >= 10) {
            int curr = n % 10;
            int next = (n / 10) % 10;
            if (curr == next) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
