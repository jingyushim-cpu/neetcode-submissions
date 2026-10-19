class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int res = 0;

        for(int bit = 0; bit < 32; bit++){
            int x = 0, y = 0;
            int mask = 1 << bit;

            for(int num : nums){
                if((num & mask) != 0){
                    x++;
                }
            }

            for(int i = 1; i < n; i++){
                if((i & mask) != 0){
                    y++;
                }
            }

            if(x > y){
                res |= mask;
            }
        }

        return res;
    }
}
