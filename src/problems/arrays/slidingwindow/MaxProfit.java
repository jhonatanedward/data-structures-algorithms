package problems.arrays.slidingwindow;

public class MaxProfit {
    public static void main(String[] args) {
        maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

    public static int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int right = 0;
        int left = 0;

        while(right < prices.length) {
            if(prices[right] < prices[left]) {
                left = right;
            }else {
                profit = Math.max(profit, prices[right] - prices[left]);
            }
            right++;
        }

        return profit;
    }
}
