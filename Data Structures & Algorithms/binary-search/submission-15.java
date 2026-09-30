class Solution {
    public int search(int[] nums, int target) {
        int left =0, right = nums.length-  1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(nums[mid] == target) return mid;
            else if(target < nums[mid]){
                right = mid - 1;
            }
            else left = mid + 1;

            if((left < nums.length && target < nums[left]) || (right > -1 && target > nums[right])) return -1;
        }

        return -1;
    }
}
