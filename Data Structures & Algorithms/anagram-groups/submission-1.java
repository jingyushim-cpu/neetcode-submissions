class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        if(n == 0) return Arrays.asList(new ArrayList<>());
        if(n == 1) return Arrays.asList(Arrays.asList(strs[0]));

        HashMap<String, List<String>> map = new HashMap<>();

        for(String value : strs){
            char[] curr = value.toCharArray();
            Arrays.sort(curr);
            String key = new String(curr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(value);
        }
        return new ArrayList<>(map.values());
    }
}