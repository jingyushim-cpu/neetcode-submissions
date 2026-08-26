class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();

        int max = 0;
        int left = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            Character key = s.charAt(i);

            if(!map.containsKey(key) || map.get(key) < left){
                map.put(key, i);
            }
            else{
                left = map.get(key) + 1;
                map.put(key, i);
            }

            max = Math.max(max, i-left+1);
        }
        
        return max;
    }
}
