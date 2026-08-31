class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";

        int[] base = new int[128];
        for(char c : t.toCharArray()){
            base[c]++;
        }

        int[] temp = new int[128];
        int have = 0, min = s.length() + 1, left = 0, index = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            temp[c]++;

            if(base[c] > 0 && base[c] >= temp[c]){
                have++;
            }

            while(have == t.length()){
                int length = i - left + 1;

                if(length < min){
                    index = left;
                    min = length;
                }
                
                char ch = s.charAt(left);
                temp[ch]--;
                left++;

                if(base[ch] > 0 && temp[ch] < base[ch]){
                    have --;
                }
            }
        }

        return (min > s.length()) ? "" : s.substring(index, index + min);
    }
}
