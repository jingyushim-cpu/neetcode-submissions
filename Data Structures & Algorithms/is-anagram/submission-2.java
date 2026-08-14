class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        int[] list = new int[26];

        for(int i = 0; i < n; i++){
            list[s.charAt(i) - 'a']++;
            list[t.charAt(i) - 'a']--;
        }

        for(int value : list){
            if(value != 0) return false;
        }

        return true;
    }
}
