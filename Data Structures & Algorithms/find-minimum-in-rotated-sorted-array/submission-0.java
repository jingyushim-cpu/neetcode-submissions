class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left <= right){
            
            int mid = left + (right - left) / 2;

            // if(nums[right] > nums[mid]){
                // right = mid - 1;
            // }
            // else if(nums[right] < nums[mid] && nums[left] > nums[right]){
                // left = mid + 1;
            // }
            // else{
                // 
            // }
            if(nums[left] <= nums[mid] && nums[mid] <= nums[right]){
                return nums[left];
            }
            else if(nums[left] >= nums[mid] && nums[mid] <= nums[right]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }

        return -1;
    }
}
