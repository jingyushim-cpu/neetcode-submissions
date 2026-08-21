class Solution {
    public boolean isValid(String s) {
        boolean result = false;

        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> couple = new HashMap<>();
        couple.put(')', '(');
        couple.put(']', '[');
        couple.put('}', '{');

        for(char c : s.toCharArray()){
            if(couple.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == couple.get(c)){
                    stack.pop();
                }
                else return false;
            }
            else stack.push(c);
        }

        return stack.isEmpty();
    }
}
