class MinStack {

    private Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Deque<Integer> tmp = new ArrayDeque<>();
        int min = stack.peek();

        while(!stack.isEmpty()){
            min = Math.min(min, stack.peek());
            tmp.push(stack.pop());
        }

        while(!tmp.isEmpty()){
            stack.push(tmp.pop());
        }

        return min;
    }
}
