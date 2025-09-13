package problems.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int num = 3;
        List<String> validsParenthesis = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtracking(stack, validsParenthesis, 0, 0, num);
    }

    public static void backtracking(StringBuilder stack, List<String> validParenthesis, int openSize, int closeSize, int n) {
        if(openSize == n && closeSize == n) {
            validParenthesis.add(stack.toString());
            return;
        }

        if(openSize < n) {
            stack.append("(");
            backtracking(stack, validParenthesis, openSize + 1, closeSize, n);
            stack.deleteCharAt(stack.length() - 1);
        }

        if(closeSize < openSize) {
            stack.append(")");
            backtracking(stack, validParenthesis, openSize, closeSize + 1, n);
            stack.deleteCharAt(stack.length() -1);
        }

    }

}
