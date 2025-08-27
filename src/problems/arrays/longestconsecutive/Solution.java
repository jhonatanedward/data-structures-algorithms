package problems.arrays.longestconsecutive;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        longestConsecutive(new int[] {2, 20, 4, 10, 3, 4, 5});
    }

    public static int longestConsecutive(int[] nums) {

        // Include all elements in a set.
        // Iterate over nums and try to find a number that is currNum -1 in the set.
        // If that element exists in  the set, that means that currNum cannot be the start of sequence.
        // So go to next number, if a number doesnt have an previous number that is less 1 than it, that number can be
        // used as the start of a subsequence, so you try to find the number+1 that is your consecutive number.

        Set<Integer> allNumbers = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            allNumbers.add(nums[i]);
        }

        int maxCount = 0;

        for(int i = 0; i< nums.length; i++) {
            if(allNumbers.contains(nums[i] - 1)){
                continue;
            }
            int temp = nums[i];
            int count = 1;
            while(allNumbers.contains(temp + 1)) {
                count++;
                temp = temp + 1;
            }
            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}
