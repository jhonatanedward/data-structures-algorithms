package problems.euler;

public class Euler06 {
    public static void main(String[] args) {
        int squareOfNums = 0;
        int sumOfNumbers = 0;

        for(int i = 1; i <= 100; i++) {
            squareOfNums += i * i;
            sumOfNumbers += i;
        }

        int result = (sumOfNumbers * sumOfNumbers) - squareOfNums;

        System.out.println(result);

    }
}
