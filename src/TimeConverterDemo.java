/**
 * @author Kevin Juan (1972002)
 */

import java.text.ParseException;
import java.util.Scanner;

public class TimeConverterDemo {
    public static void main(String[] args) throws ParseException{
        int input;
        Scanner sc = new Scanner(System.in);
        TimeConverter tc = new TimeConverter();
        System.out.println("==============================");
        System.out.println("      TIME CONVERTER APP      ");
        System.out.println("==============================");
        System.out.print("Input time (second, 0 to exit) : ");
        input = sc.nextInt();
        tc.setSecond(input);
        while (input != 0){
            System.out.print("Converted Time : ");
            System.out.println(tc.showTime());
            System.out.print("Input time (second, 0 to exit) : ");
            input = sc.nextInt();
            tc.setSecond(input);
        }

    }
}
