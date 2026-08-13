class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            for(int j = 0; j < t.length(); j++){
                char d = t.charAt(j);
                if(c == d){
                    if(j != 0) t = t.substring(0 , j) + t.substring(j+1);
                    else if(j == 0) t = t.substring(1);
                    break;
                }

            }

        }
        if(t.length() == 0) return true;
        else return false;
    }
}
