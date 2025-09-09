package problems.arrays.twopointers;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        maxArea(new int[] {1, 8, 6,2,5,4,8,3,7});
    }

    public static int maxArea(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(area, res);
            if(height[l] < height[r]) {
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}
