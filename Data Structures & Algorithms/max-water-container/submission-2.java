class Solution {
    public int maxArea(int[] heights) {
        int height = 0;
        for(int num : heights){
            if (num > height) height = num;
        }

        int amount = 0;
        int left = 0, right = heights.length - 1;

        for(int i = 0; i <= height; i++){

            while(left < right){
                if(heights[left] < i) left++;
                else if(heights[right] < i) right--;
                else{
                    amount = Math.max(amount, (right-left)*i);
                    break;
                }
            }
        }
        

        return amount;

    }
}
