//1972002 Kevin Juan
import java.text.NumberFormat;
import java.util.Scanner;


public class Nomor1_1972002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.print("Masukan uang yang hendak didepositokan : ");
        int deposito = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukan lama deposito (Tahun) : ");
        int lamaDeposit = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukan bunga deposito : ");
        double bunga = sc.nextDouble();
        sc.nextLine();

        double totalBunga = (bunga/100) * deposito * lamaDeposit;
        double totalAkhir = totalBunga + deposito;

        System.out.println("Jumlah Uang : " + nf.format(deposito));
        System.out.println("Bunga Deposito : " + nf.format(totalBunga));
        System.out.println("Saldo Akhir : " + nf.format(totalAkhir));
    }
}
