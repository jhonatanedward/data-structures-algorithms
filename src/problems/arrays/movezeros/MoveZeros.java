package problems.arrays.movezeros;

public class MoveZeros {
    public static void main(String[] args) {
        move(new int[]{0,1,0,3,12});
    }

    public static void move(int[] nums){
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        if(index < nums.length) {
            for(;index < nums.length; index++) {
                nums[index] = 0;
            }
        }
        System.out.println();
    }
}
