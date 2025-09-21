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
            int totalTime = 0;
            for(int pile : piles) {
                totalTime += (int) Math.ceil((double) pile / k);
            }

            if(totalTime > h) {
                l = k + 1;
            }else {
                result = k;
                r = k - 1;
            }
        }

        return result;
//        int left = 1;
//        int right = Arrays.stream(piles).max().getAsInt();
//        int r = h;
//
//        while(left <= right) {
//            int k = (right + left)  / 2;
//            int hoursToEat = 0;
//            for(int pile : piles) {
//                hoursToEat += (int) Math.ceil((double) pile / k);
//            }
//
//            if(hoursToEat > h) {
//                left = k + 1; // means koko needs to eat more bananas per hour to achive h.
//            }else {
//                r = k;
//                right = k - 1;
//            }
//        }
//
//        return r;
    }
}
