package problems.arrays.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        new ThreeSum().solution(new int[] {-1,0,1,2,-1,-4}, 0);
        new ThreeSum().solution(new int[] {0,0,0,0}, 0); // Edge Case, must return [0,0,0]
        new ThreeSum().solution(new int[] {-1,0,1,2,-1,-4}, 0); // Edge case...
    }

    public List<List<Integer>> solution(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            // That if avoid duplicates in the first element from the triplet.
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target) {
                    triplets.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // That while avoid duplicates in the second and third element from the triplet.
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum > target) {
                    right--;
                }else {
                    left++;
                }
            }
        }

        return triplets;
    }
}
