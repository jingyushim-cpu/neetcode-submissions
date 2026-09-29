class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right = 0; 

        for(int num : piles){
            right = Math.max(right, num);
        }

        int left = 1;

        while(left <= right){
            int mid = left + (right-left) /2;

            if(eatInTime(piles, mid, h)){
                right = mid - 1;
            }
            else left = mid + 1;

        }

        return left;
    }

    private boolean eatInTime(int[] piles, int mid, int h){
        int total = 0;
        for(int num : piles){
            total += num / mid;
            if(num % mid != 0) total++;

            if(total > h) return false;
        }
        
        return true;
    }
}
