class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();

        for(int num : nums){
            set.add(num);
        }
        int max = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int curr = num;
                int length = 1;

                while(set.contains(curr+1)){
                    curr++;
                    length++;
                }

                if(length > max) max = length;
            }
        }

        return max;
    }
}
