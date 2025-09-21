package codetemplates;

public class TwoPointers {

    public int fn(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        // do some logic here with left and right
        while(left < right) {
            if(true) { // condition
                left ++;
            }else {
                right--;
            }
        }
        return ans;
    }

    // two pointer exaust both
    public int fn1(int[] arr, int arr2[]) {
        int i = 0, j = 0, ans = 0;

        while(i < arr.length && j < arr2.length) {
            // do some logic here
            if(true) { // condition
                i ++;
            }else {
                j ++;
            }
        }

        while(i < arr.length) {
            // do logic
        }

        while(j < arr2.length) {
            // do logic
        }

        return ans;
    }
}
