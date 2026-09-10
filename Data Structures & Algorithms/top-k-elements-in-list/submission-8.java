class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0 ; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int index = 0;

        for(int i = freq.length - 1; i > 0 && index < k; i--){

            for(int n: freq[i]){
                result[index++] = n;
                if(index == k) return result;
            }
        }

        return result;
    }
}

/*
Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        

        PriorityQueue<Integer, Integer> que = new PriorityQueue<>();

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort((a, b) -> b.getValue - a.getValue);
*/
