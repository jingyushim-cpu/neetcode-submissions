class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] perm = new int[26];
        for(Character c : s1.toCharArray()){
            perm[c - 'a']++;
        }

        int[] temp = new int[26];
        for(int i = 0; i < s2.length(); i++){
            char c = s2.charAt(i);
            temp[c - 'a']++;

            if(i > s1.length() - 1){
                temp[s2.charAt(i - s1.length()) - 'a']--;
            }

            if(Arrays.equals(perm, temp)) return true;
            
        }

        return false;
    }
}
