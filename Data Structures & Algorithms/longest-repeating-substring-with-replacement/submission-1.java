class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length() == 1 || k == s.length()) return s.length();

        int result = 0, maxf = 0;
        int[] count = new int[128];
        int left = 0;

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)]++;
            maxf = Math.max(maxf, count[s.charAt(i)]);
            
            //keep moving the same sized window until the possible bigger window
            while(i - left + 1 - maxf > k){
                count[s.charAt(left)]--;
                left++;
            }

            result = Math.max(result, i - left + 1);
        }
        return result;

    }
}
