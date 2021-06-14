//1972002 Kevin Juan
import java.util.Scanner;

public class NumberConverterDemo {
    public static void main(String[] args) {
        int pil,num;


        Scanner sc = new Scanner(System.in);
        NumberConverter nc = new NumberConverter();

        pil = -1;
        while (pil != 4){
            System.out.println("==============================================");
            System.out.println("Number Converter");
            System.out.println("==============================================");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Decimal to Octal");
            System.out.println("3. Decimal to Hex");
            System.out.println("4. Exit");
            System.out.print("Choice : ");
            pil = sc.nextInt();

            if (pil == 1){
                System.out.print("Number to convert : ");
                num = sc.nextInt();
                System.out.println("Converted Number is " + nc.convertToBinary(num));
            }else if (pil == 2){
                System.out.print("Number to convert : ");
                num = sc.nextInt();
                System.out.println("Converted Number is " + nc.convertToOctal(num));
            }else if (pil == 3){
                System.out.print("Number to convert : ");
                num = sc.nextInt();
                System.out.println("Converted Number is " + nc.convertToHex(num));
            }


        }
    }
}
