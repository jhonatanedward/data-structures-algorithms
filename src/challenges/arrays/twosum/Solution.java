package challenges.arrays.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                new Solution().twoSum(new int[] {3,4,5,6}, 7)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sums = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(sums.containsKey(target - nums[i])){
                return new int[] {i, sums.get(target - nums[i])};
            }

            sums.put(nums[i], i);
        }

        return new int[] { 0, 0};
    }
}
