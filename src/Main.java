import datastructures.hashmap.HashTable;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] meuOvo = new int[]{1,2,3,4};
        containsDuplicate(meuOvo);
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> existingNums = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            //if(existingNums.contains(nums[i])) return true;
            //existingNums.add(nums[i]);
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
