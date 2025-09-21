package problems.stack;

import java.util.Map;
import java.util.Stack;

public class LargestRectangleArea {

    public static void main(String[] args) {
        int[] heights = new int[] {7, 1, 7, 2, 2, 4};
        int[] heights2 = new int[] {2, 1, 5, 6, 2, 3};
        largestRectangleArea2(heights2);
    }

    public static int largestRectangleArea2(int[] heights) {
        int maxArea = 0;
        Stack<int[]> allValues = new Stack<>();

        for(int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int start = i;
            while(!allValues.isEmpty() && allValues.peek()[1] > height) {
                int[] popped = allValues.pop();
                maxArea = Math.max(maxArea, popped[1] * (i - popped[0]));
                start = popped[0];
            }

            allValues.add(new int[] {start, height});
        }

        while(!allValues.isEmpty()) {
            int[] popped = allValues.pop();
            maxArea = Math.max(maxArea, popped[1] * (heights.length - popped[0]));
        }

        return maxArea;
    }

    // brute force approach
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        for(int i = 0; i < n; i++) {
            int currNum = heights[i];

            int rightMost = i + 1;
            while(rightMost < n && heights[rightMost] >= currNum) {
                rightMost++;
            }


            int leftMost = i - 1;
            while(leftMost >= 0 && heights[leftMost] >= currNum) {
                leftMost--;
            }

            rightMost--;
            leftMost++;
            maxArea = Math.max(maxArea, currNum * (rightMost - leftMost + 1));
        }
        return maxArea;
    }
}
