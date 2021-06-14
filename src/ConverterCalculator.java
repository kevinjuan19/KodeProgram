/**
 * @author Kevin Juan (1972002)
 */

import java.util.regex.*;
public class ConverterCalculator {
    private static String regex = "^[0-1]{1,}$";

    public static String convertToBinary (int number){
        return coreConverterFromDecimal(number,2);
    }
    public static String convertToHexa(int number){
        return coreConverterFromDecimal(number,16);
    }
    public static String convertToOctal(int number){
        return coreConverterFromDecimal(number,8);
    }
    public static int convertBinaryToDecimal(String number){
        return coreConverterToDecimal(number,2);
    }
    public static int convertHexaToDecimal(String number){
        return coreConverterToDecimal(number,16);
    }
    private static String coreConverterFromDecimal(int number, int radix){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j;
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(number > 0)
        {
            if (i % 4 == 0 && radix == 2 || i % 4==0 && radix == 16){
                sb.append(" ");
            }else if (i % 3 == 0 && radix == 8){
                sb.append(" ");
            }
            if (radix == 2){
                sb.append (number % radix);
                number = number / radix;
                i++;
            }else if (radix == 8) {
                sb.append(number % radix);
                number = number / radix;
                i++;
            }else if (radix == 16){
                j = number % 16;
                sb.append(hexchars[j]);
                number = number / radix;
                i++;
            }
        }
        sb.reverse();
        return sb.toString();
    }
    private static int coreConverterToDecimal(String numberString, int radix){
        Pattern compileRegex = Pattern.compile(regex);
        Matcher matcher = compileRegex.matcher(numberString);

        boolean matchFound = matcher.find();
        int hasil = 0;
        if (matchFound && radix == 2) {
            double binNum = 0;
            for (int i = 0; i < numberString.length(); i++) {
                if (numberString.charAt(i) == '1') {
                    binNum = binNum + Math.pow(2, numberString.length() - 1 - i);
                }
            }
            hasil = (int) Math.round(binNum);
        } else if (!matchFound && radix == 16){
            numberString = numberString.toUpperCase();
            String hexchar = "0123456789ABCDEF";
            for (int i = 0; i < numberString.length(); i++) {
                char charNumber = numberString.charAt(i);
                int indexHex = hexchar.indexOf(charNumber);
                hasil = 16 * hasil + indexHex;
            }
        }
        return hasil;
    }
}
