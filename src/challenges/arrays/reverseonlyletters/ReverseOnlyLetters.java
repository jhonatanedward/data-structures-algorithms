package challenges.arrays.reverseonlyletters;

public class ReverseOnlyLetters {
    public static void main(String[] args) {

    }

    public String reverse(String s) {
        char[] teste = s.toCharArray();
        int right = teste.length - 1;
        int left = 0;

        while(left < right) {

            if(!Character.isLetter(teste[left])){
                left++;
                continue;
            }

            if(!Character.isLetter(teste[right])) {
                right--;
                continue;
            }

            char temp = teste[left];
            teste[left] = teste[right];
            teste[right] = temp;

            left++;
            right--;
        }

        return new String(teste);
    }
}
