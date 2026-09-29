class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right = 0;

        for (int num : piles) {
            right = Math.max(right, num);
        }

        int left = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (eatInTime(piles, mid, h)) {
                right = mid - 1;
            } else
                left = mid + 1;
        }

        return left;
    }

    public boolean eatInTime(int[] piles, int mid, int h) {
        long total = 0;
        for (int num : piles) {
            total += (num - 1) / mid + 1;

            if (total > h)
                return false;
        }

        return true;
    }
}
