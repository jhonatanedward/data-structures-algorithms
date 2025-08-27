package problems.arrays.slidingwindow;

public class MinSubArrayLen {
    /*
    Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
    whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
     */
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7,new int[] {2,3,1,2,4,3})); // Expected = 2
        System.out.println(minSubArrayLen(4,new int[] {1,4,4})); // Expected = 2
        System.out.println(minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1})); // Expected = 0
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int L = 0;
        int minimal = Integer.MAX_VALUE;
        int currSum = 0;
        for(int R = 0; R < nums.length; R++) {
            currSum += nums[R];
            while(currSum >= target) {
                minimal = Math.min(minimal, R - L + 1);
                currSum -= nums[L];
                L++;
            }
        }
        return minimal == Integer. MAX_VALUE? 0 : minimal;
    }
}
