package challenges.numbers;

import java.util.ArrayList;
import java.util.List;

public class ReverseIntWithoutBuiltIn {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static int solution(int n) {
        List<Integer> inverted = new ArrayList<>();

        while(n > 0) {
            int extracted = n % 10;
            inverted.add(extracted);
            n = n / 10;
        }

        int retorno = 0;

        for(int i : inverted) {
            retorno = retorno * 10 + i;
        }

        return retorno; // Placeholder return
    }
}
