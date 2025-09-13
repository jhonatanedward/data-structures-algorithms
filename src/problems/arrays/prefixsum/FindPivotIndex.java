package problems.arrays.prefixsum;

public class FindPivotIndex {
    /*
        Given an array of integers nums, calculate the pivot index of this array.

        The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

        If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

        Return the leftmost pivot index. If no such index exists, return -1.
     */

    public static void main(String[] args) {
        // 2,1,-1
        new FindPivotIndex().pivotIndex(new int[]{1,7,3,6,5,6});
    }

    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int total = 0;
        for(int i = 0; i < sumLeft.length; i++) {
            total += nums[i];
            sumLeft[i] = total;
        }

        for(int i = 0; i < sumLeft.length; i++) {
            int totalRight = total - sumLeft[i];
            if(totalRight == (sumLeft[i] - nums[i])) {
                return i;
            }
        }
        return -1;
    }
}
