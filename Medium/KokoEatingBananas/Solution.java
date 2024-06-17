package Medium.KokoEatingBananas;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = piles[0];
        
        for (int i = 0; i < piles.length; i++) {
            hi = Math.max(piles[i], hi);
        }

        int mid = (lo + hi) / 2;

        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (!checkVal(mid, h, piles)) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        if (checkVal(mid, h, piles)) {
            return mid;
        } else {
            return mid + 1;
        }
        
    }

    private boolean checkVal(int v, int h, int[] piles) {
        int totalTime = 0;

        for (int pile : piles) {
            totalTime += Math.ceil((double) pile / v);
        }

        return totalTime <= h;
    }
}
