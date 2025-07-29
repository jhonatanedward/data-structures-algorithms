package challenges.strings.reverseprefixofword;

public class ReversePrefixOfWord {
    public static void main(String[] args) {

    }

    public static String reversePrefix(String word, char ch) {
        char[] teste = word.toCharArray();
        int index = -1;

        for(int i = 0; i < teste.length; i++) {
            if(teste[i] == ch){
                index = i;
                break;
            }
        }

        if(index >= 0) {
            int left=0;
            int right=index;
            while(left < right) {
                char temp = teste[left];
                teste[left] = teste[right];
                teste[right] = temp;
                left++;
                right--;
            }
        }
        return new String(teste);
    }
}
