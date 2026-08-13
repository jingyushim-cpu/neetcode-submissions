class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        if(nums.length == 0) return false;
        int prev = nums[0];

        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];

            if(prev == curr){
                return true;
            }
            prev = curr;
        }

        return false;
    }
}