class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> mapping=new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');
        for(char ch:s.toCharArray()){
            if(mapping.containsValue(ch)){
                stack.push(ch);
            }else if(mapping.containsKey(ch)){
                if (!stack.isEmpty() && stack.peek() == mapping.get(ch)){
                    stack.pop();
                }else{
                    return false;
                }               
            }
        }return stack.isEmpty();
    }
}
