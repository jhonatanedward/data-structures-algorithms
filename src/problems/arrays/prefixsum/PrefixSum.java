package problems.arrays.prefixsum;

public class PrefixSum {
    public static void main(String[] args) {
        PrefixSum prefixSum = new PrefixSum(new int[]{2, -1, 3, -3, 4});
        System.out.println(prefixSum.rangeSum(1, 3));
    }
    int[] prefix;
    public PrefixSum(int nums[]) {
        this.prefix = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }
    }

    public int rangeSum(int left, int right) {
        int rightSum = prefix[right];
        int leftSum = prefix[left - 1 == -1 ? 0: left - 1];
        return rightSum - leftSum;
    }

}
