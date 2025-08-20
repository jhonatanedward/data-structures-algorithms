package challenges.arrays.productofarrayexcept;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().productExceptSelf(new int[]{1,2,4,6}));
    }
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        for(int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = nums[i] * prefix;
        }

        int sufix = 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * sufix;
            sufix = nums[i] * sufix;
        }

        return result;
    }
}
