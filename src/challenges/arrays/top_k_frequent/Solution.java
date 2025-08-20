package challenges.arrays.top_k_frequent;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[] { 1, 1, 1, 2, 2, 3};
        int[] result = solution.topKFrequent(arr, 2);
        System.out.println(Arrays.toString(result));
    }

    public int[] topKFrequentUsingHeap(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(counts::get));

        for(int num : counts.keySet()) {
            heap.add(num);
            if(heap.size() > k) {
                heap.remove();
            }
        }

        int[] kFrequent = new int[k];

        for(int i = 0; i < k; i++) {
            kFrequent[i] = heap.remove();
        }

        return kFrequent;
    }

    // Complexity O(N)
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        /*
            Contains nums.length + 1 because we need the number of itens in array to store it frequency if it is the
            only one value in the array, ex:
            if array was: [4,4,4] we need 3 buckets:
             0   1   2   3
           [[0] [0] [0] [4]] - because 3 apeears 3 times
         */
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for(int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];

        int j = 0;

        for(int i = buckets.length - 1; i > 0; i--) {
            for(int num : buckets[i]) {
                result[j] = num;
                if(++j == k) {
                    return result;
                }
            }
        }
        return result;
    }
}


























