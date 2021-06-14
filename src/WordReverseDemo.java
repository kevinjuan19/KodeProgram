/**
 * @author Kevin Juan
 */

import java.util.Scanner;

public class WordReverseDemo {
    public static void main(String[] args) {
        WordReverser reverse = new WordReverser();
        Scanner sc = new Scanner(System.in);
        String word = "-";
        while (!word.equals("0")){
            System.out.print("Input Kalimat (0 untuk keluar) : ");
            word = sc.nextLine();
            System.out.println("Hasil Pembalikan : " + reverse.reverseWord(word));
        }
    }
}
