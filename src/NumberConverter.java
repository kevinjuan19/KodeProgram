//1972002 Kevin Juan
public class NumberConverter {
    public static String convertToBinary(int number){
        String toBiner = Integer.toBinaryString(number);
        return toBiner;
    }
    public static String convertToOctal(int number){
        String toOctal = Integer.toOctalString(number);
        return toOctal;
    }
    public static String convertToHex(int number){
        String toHex = Integer.toHexString(number);
        return toHex;
    }
}
