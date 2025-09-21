package problems.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {


        search(new int[] {-1,0,2,4,6,8}, 4);
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int retorno = -1;

        while(left <= right) {
            int mid = (right + left) / 2;

            if(nums[mid] > target) {
                right = mid - 1;
            }else if(nums[mid] < target) {
                left = mid + 1;
            }else {
                return mid;
            }
        }

        return retorno;
    }
}
