package problems.arrays.slidingwindow;

import java.util.HashSet;

public class ContainsNearbyDuplicate {
    /*
        Given an integer array nums and an integer k, return true if there are two distinct indices i and j
        in the array such that nums[i] == nums[j] and abs(i - j) <= k.
     */
    public static void main(String[] args) {

        System.out.println(verify(new int[]{1,2,3,1}, 3)); // must return true;
        System.out.println(verify(new int[]{1,2,3,1,2,3}, 2)); // must return false;
    }

    public static boolean verify(int[] nums, int k) {
        HashSet<Integer> windowValues = new HashSet<>();

        int l = 0;

        for(int r = 0; r < nums.length; r++) {
            if(r - l > k) {
                windowValues.remove(nums[l]);
                l++;
            }
            if(windowValues.contains(nums[r])) {
                return true;
            }
            windowValues.add(nums[r]);
        }

        return false;
    }
}
