class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;

        int right = 0;
        for(int num : piles){
            if(num > right) right = num;
        }

        int result = right;

        while(low <= right){
            int k = (low + right) / 2;

            long total = 0;
            for(int num : piles){
                total += Math.ceil((double) num / k);
            }

            if(total <= h){
                result = k;
                right = k - 1;
            }
            else{
                low = k + 1;
            }
        }

        return result;


    }
}
