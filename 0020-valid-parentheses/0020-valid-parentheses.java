public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stk.push(c);
            } else if (c == ')' && (stk.isEmpty() || stk.pop() != '(')) {
                return false;
            } else if (c == ']' && (stk.isEmpty() || stk.pop() != '[')) {
                return false;
            } else if (c == '}' && (stk.isEmpty() || stk.pop() != '{')) {
                return false;
            }
        }
        return stk.isEmpty();
    }
}