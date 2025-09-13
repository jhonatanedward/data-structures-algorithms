package problems.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        // isValid("{}");
        isValid("{]");
    }

    public static boolean isValid(String s) {
        Stack<Character> allBrackets = new Stack<>();
        Map<Character, Character> closeToOpenBrackets = Map.of(']', '[', ')', '(', '}', '{');
        for(int i = 0; i < s.length(); i++) {
            if(closeToOpenBrackets.containsKey(s.charAt(i))) {
                if(!allBrackets.isEmpty() && allBrackets.peek() == closeToOpenBrackets.get(s.charAt(i))) {
                    allBrackets.pop();
                }else {
                    return false;
                }
            }else{
                allBrackets.add(s.charAt(i));
            }
        }
        return true;
    }
}
