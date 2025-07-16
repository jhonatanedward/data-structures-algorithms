package baseconverter;

public class BaseConversion {

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        Integer decimalToConvert = decimal;
        StringBuilder sb = new StringBuilder();
        while(decimalToConvert > 0) {
            sb.append(decimalToConvert % 2);
            decimalToConvert = decimalToConvert / 2;
        }
        return sb.reverse().toString();
    }

    public static Integer binaryToDecimalLeftToRight(int[] binaryNumber) {
        Integer current = 0;
        for(int i =0 ; i < binaryNumber.length; i++) {
            current = (current * 2) + binaryNumber[i];
        }

        return current;
    }

    public static Integer binaryToDecimalRightToLeft(int[] binaryNumber) {
        Integer decimal = 0;
        Integer currentPower = 1;

        for(int i = binaryNumber.length - 1; i >= 0; i--) {
            decimal += binaryNumber[i] * currentPower;
            currentPower *= 2;
        }

        return decimal;
    }


    public static void main(String[] args) {
        System.out.println("The number 10 in base 2 is: " + decimalToBinary(10));

        int[] a = new int[] {1,0,1,0};

        System.out.println(binaryToDecimalRightToLeft(a));
    }
}
