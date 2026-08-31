class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, max = 0;
        int rep = 0;
        int[] letters = new int[128];

        for(int right = 0; right < s.length(); right++){
            letters[s.charAt(right)]++;
            rep = Math.max(rep, letters[s.charAt(right)]);

            if(right - left - rep + 1 > k){
                letters[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
