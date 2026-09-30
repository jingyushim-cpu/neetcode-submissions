class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = 0;

        for (int num : piles) {
            if (num > high)
                high = num;
        }

        int low = 1;

        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (eatInTime(piles, h, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public boolean eatInTime(int[] piles, int h, int mid) {
        long total = 0;

        for (int num : piles) {
            total += num / mid;
            if (num % mid != 0)
                total++;

            if (total > h)
                return false;
        }

        return true;
    }
}
