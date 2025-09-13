package problems.stack;

import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {
        int[] temperatures = new int[] {30,38,30,36,35,40,28};
        dailyTemperatures(temperatures);
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> tempStack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!tempStack.empty() && temperatures[i] > temperatures[tempStack.peek()]) {
                int peaked = tempStack.pop();
                ans[peaked] = (i - peaked);
            }
            tempStack.add(i);
        }
        return ans;
    }
}
