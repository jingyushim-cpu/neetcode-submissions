class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

//        List<List<String>> result = new ArrayList<>();

        if(n == 0) return Arrays.asList(new ArrayList<>());
        if(n == 1) return Arrays.asList(Arrays.asList(strs[0]));

//        List<List<Character>> copy = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(String value : strs){
            char[] curr = value.toCharArray();
            Arrays.sort(curr);
//            copy.add(curr);
            String key = new String(curr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(value);
        }
        return new ArrayList<>(map.values());
    }
}


/*
        for(int i = 0; i < n; i++){
            //compare this String to the rest of the values
            char[] base = strs[i].toCharArray(); 
            Arrays.sort(base);
            List<String> group = new ArrayList<>();

            for(int j = ){
                char[] curr = strs[j].toCharArray();
                Arrays.sort(curr);
                if(Arrays.equals(base, curr)){
                    group.add(Arrays.asList());
                }
                
            }

            result.add(group);

        }
*/