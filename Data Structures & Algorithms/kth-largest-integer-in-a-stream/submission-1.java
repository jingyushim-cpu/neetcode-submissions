class KthLargest {

    int th;
    PriorityQueue<Integer> q;

    public KthLargest(int k, int[] nums) {
        th = k;
        q = new PriorityQueue<>();

        for(int num: nums){
            q.add(num);

            if(q.size() > th){
                q.poll();
            }
        }
    }
    
    public int add(int val) {
        q.add(val);
        
        if(q.size() > th){
            q.poll();
        }
        
        return q.peek();
    }
}
