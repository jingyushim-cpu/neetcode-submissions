class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            //char[] c = strs[i].toCharArray();
            int[] num = new int[26];

            for(char ch : strs[i].toCharArray()){
                num[ch - 'a']++;
            }

            String key = Arrays.toString(num);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
