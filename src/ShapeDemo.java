/**
 * @author Kevin Juan (1972002)
 */
import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoDimensionalShape rectangle = new Rectangle();
        TwoDimensionalShape square = new Square();
        ThreeDimensionalShape sphere = new Sphere();
        ThreeDimensionalShape cylinder = new Cylinder();

        int pil;
        double panjang, lebar, tinggi, rad;
        do {
            System.out.println("========================");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Sphere");
            System.out.println("4. Cylinder");
            System.out.println("5. Exit");
            System.out.print("Choice : ");
            pil = sc.nextInt();
            if (pil == 1) {
                System.out.print("Length of side : ");
                panjang = sc.nextDouble();
                if (panjang == 0) {
                    System.out.println("Length of side must have a value > 0");
                } else {
                    ((Square) square).setLengthOfSide(panjang);
                    square.showDetail();
                }
            } else if (pil == 2) {
                System.out.print("Width : ");
                lebar = sc.nextDouble();
                System.out.print("Heigth : ");
                tinggi = sc.nextDouble();
                if (lebar == 0 || tinggi == 0) {
                    System.out.println("Width or Heigth must have a value > 0");
                } else {
                    ((Rectangle) rectangle).setBase(lebar);
                    ((Rectangle) rectangle).setHeight(tinggi);
                    rectangle.showDetail();
                }
            } else if (pil == 3) {
                System.out.print("Radius : ");
                rad = sc.nextDouble();
                if (rad == 0) {
                    System.out.println("Radius must have a value > 0");
                } else {
                    ((Sphere) sphere).setRadius(rad);
                    sphere.showDetail();
                }
            }
            else if(pil == 4){
                System.out.print("Radius : ");
                rad = sc.nextDouble();
                System.out.print("Heigth : ");
                tinggi = sc.nextDouble();
                if(rad == 0 || tinggi == 0){
                    System.out.println("Radius or Heigth must have a value > 0");
                }
                else{
                    ((Cylinder)cylinder).setRadius(rad);
                    ((Cylinder)cylinder).setHeigth(tinggi);
                    cylinder.showDetail();
                }

            }
        }while (pil != 5) ;
    }
}
