//1972002 Kevin Juan
import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;


public class Nomor2_1972002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.print("Masukan Bilangan : ");
        double bil = sc.nextDouble();
        double pangkat = Math.pow(bil,2);
        double pangkat5 = Math.pow(bil,5);
        double akarKuadrat = Math.sqrt(bil);
        double absolute = Math.abs(bil);
        double pembulatan = Math.round(bil);
        System.out.println("Hasil Kuadrat : " + nf.format(pangkat));
        System.out.println("Hasil Pangkat 5 : " + nf.format(pangkat5));
        System.out.println("Hasil Akar Kuadrat : " + nf.format(akarKuadrat));
        System.out.println("Absolute : " + nf.format(absolute));
        System.out.println("Hasil Pembulatan : " + nf.format(pembulatan));

    }
}
