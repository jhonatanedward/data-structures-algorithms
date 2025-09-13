package problems.arrays.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        permute(new int[] { 1, 2, 3});
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutationList = new ArrayList<>();
        backtracking(new ArrayList<>(), permutationList, nums);
        return permutationList;
    }

    public static void backtracking(List<Integer> curr, List<List<Integer>> permutationList, int[] nums) {
        if(curr.size() == nums.length) {
            permutationList.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(curr.contains(nums[i])) {
                continue;
            }
            curr.add(nums[i]);
            backtracking(curr, permutationList, nums);
            curr.remove(curr.size() - 1);
        }
    }
}
