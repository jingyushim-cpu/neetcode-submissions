class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Binary search the shorter array.
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        while (left <= right) {
            int i = left + (right - left) / 2;
            int j = (m + n + 1) / 2 - i;

            int aLeft = (i == 0)
                ? Integer.MIN_VALUE : nums1[i - 1];

            int aRight = (i == m)
                ? Integer.MAX_VALUE : nums1[i];

            int bLeft = (j == 0)
                ? Integer.MIN_VALUE : nums2[j - 1];

            int bRight = (j == n)
                ? Integer.MAX_VALUE : nums2[j];

            if (aLeft <= bRight && bLeft <= aRight) {
                // Correct partition found.
                if ((m + n) % 2 == 1) {
                    return Math.max(aLeft, bLeft);
                }

                long maxLeft = Math.max(aLeft, bLeft);
                long minRight = Math.min(aRight, bRight);

                return (maxLeft + minRight) / 2.0;
            } else if (aLeft > bRight) {
                // Too many elements taken from nums1.
                right = i - 1;
            } else {
                // Too few elements taken from nums1.
                left = i + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays must be sorted.");
    }
}