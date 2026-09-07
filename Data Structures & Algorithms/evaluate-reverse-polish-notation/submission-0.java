class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < tokens.length; i++){
            String s = tokens[i];

            if(!stack.isEmpty() && s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();

                if(s.equals("+")) stack.push(b + a);
                else if(s.equals("-")) stack.push(b - a);
                else if(s.equals("*")) stack.push(b * a);
                else if(s.equals("/")) stack.push(b / a);
            }
            else stack.push(Integer.parseInt(s));
        }

        return stack.pop();
    }
}
