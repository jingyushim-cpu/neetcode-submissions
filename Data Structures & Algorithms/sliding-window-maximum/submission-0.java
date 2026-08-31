class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < nums.length; right++) {
            // 1. Remove indices outside the window
            if (!deque.isEmpty() && deque.peekFirst() <= right - k) {
                deque.pollFirst();
            }

            // 2. Remove smaller values from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]) {
                deque.pollLast();
            }

            // 3. Add current index
            deque.offerLast(right);

            // 4. Once we have a complete window, record maximum
            if (right >= k - 1) {
                result[right - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}