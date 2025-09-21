package problems.binarysearch;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        new KokoEatingBananas().minEatingSpeed(new int[]{3,6,7,11}, 8);
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int result = h;
        while(l <= r) {
            int k = l + (r - l) / 2;
            Long totalTime = 0L;
            for(int pile : piles) {
                totalTime += (pile + k - 1) / k;
            }

            if(totalTime > h) {
                l = k + 1;
            }else {
                result = k;
                r = k - 1;
            }
        }

        return result;
    }
}
