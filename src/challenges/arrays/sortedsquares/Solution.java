package challenges.arrays.sortedsquares;

public class Solution {


    public static void main(String[] args) {
        int[] teste = {-4,-1,0,3,10};
        sortedSquares(teste);
    }
    public static int[] sortedSquares(int [] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n -1;

        for(int i = n -1; i >= 0; i--) {
            int square;
            if(Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            }else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }

        return result;
    }

    // Brute force using bubble sort.
    public static int[] sortedSquaresBruteForce(int[] nums) {
        int[] squares = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }

        for(int i = squares.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(squares[j] > squares[j+1]) {
                    int temp = squares[j];
                    squares[j] = squares[j+1];
                    squares[j+1] = temp;
                }
            }
        }

        return squares;
    }
}
