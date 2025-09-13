package problems.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        evalRPN(new String[]{"2","1","+","3","*"});
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {
            String currToken = tokens[i];
            if(currToken.equals("+")){
                numbers.push(numbers.pop() + numbers.pop());
            }else if(currToken.equals("-")) {
                int firstNumber = numbers.pop();
                int secondNumber = numbers.pop();
                numbers.push(secondNumber - firstNumber);
            }else if(currToken.equals("/")) {
                int firstNumber = numbers.pop();
                int secondNumber = numbers.pop();
                numbers.push(secondNumber / firstNumber);
            }else if(currToken.equals("*")) {
                numbers.push(numbers.pop() * numbers.pop());
            }else {
                numbers.push(Integer.parseInt(tokens[i]));
            }
        }

        return numbers.pop();
    }
}
