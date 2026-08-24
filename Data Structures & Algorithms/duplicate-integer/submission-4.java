class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 1 || nums.length == 0) return false;

        Set<Integer> numbers = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(numbers.contains(nums[i]))   return true;

            numbers.add(nums[i]);
        }

        return false;
    }
}