class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b - a);

        for(int num: stones){
            q.add(num);
        }

        while(q.size() > 1){
            int diff = q.poll() - q.poll();

            if(diff != 0){
                q.add(diff);
            }            
        }

        return q.size() == 1 ? q.peek() : 0;


    }
}
