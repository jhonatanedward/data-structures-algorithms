package problems.arrays.prefixsum;


public class TrappingRainWater {

    public static void main(String[] args) {
        trapSolutionUsingOneExtraSpaceMemory(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
    }
    public static int trapSolutionUsingOneExtraSpaceMemory(int[] height) {
        int[] tempComputedArr = new int[height.length];
        int maxLeft = 0;

        for(int i = 0; i < height.length; i++) {
            tempComputedArr[i] = maxLeft;
            maxLeft = Math.max(maxLeft, height[i]);
        }

        int maxRight = 0;

        for(int i = height.length - 1; i >= 0; i--) {
            int minBetweenLeftAndRight = Math.min(tempComputedArr[i], maxRight);
            if(minBetweenLeftAndRight > height[i]) {
                tempComputedArr[i] = minBetweenLeftAndRight - height[i];
            }else {
                tempComputedArr[i] = 0;
            }
            maxRight = Math.max(maxRight, height[i]);
        }

        int res = 0;
        for(int i = 0; i < tempComputedArr.length; i++) {
            res += tempComputedArr[i];
        }

        return res;
    }

    public static int preComputedDataSolution(int[] height) {
        int n = height.length;
        if(n == 0) {
            return 0;
        }
        // Pre-compute left higer for each position
        int[] maxLeft = new int[n];
        maxLeft[0] = height[0];

        for(int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        int[] minRight = new int[n];
        minRight[n - 1] = height[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.max(minRight[i + 1], height[i]);
        }

        int res = 0;
        for(int i = 0; i < n; i++) {
            res += Math.min(maxLeft[i], minRight[i]) - height[i];
        }

        return res;
    }
}
