/**
 * @author Kevin Juan(1972002)
 */

import java.util.Scanner;

public class WareHouseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WareHouse wh = new WareHouse();
        WareHouseManager whm = new WareHouseManager(wh);
        int pil =-1;
        do {
            System.out.println("===========================");
            System.out.println("1. Add Shoe ");
            System.out.println("2. Add Shirt ");
            System.out.println("3. View all item ");
            System.out.println("4. Exit ");
            System.out.print("Choice : ");
            pil = sc.nextInt();

            if (pil==1){
                sc.nextLine();
                System.out.print("Brand : ");
                String brand= sc.nextLine();
                System.out.print("Name : ");
                String name= sc.nextLine();
                System.out.print("Color : ");
                String color= sc.nextLine();
                System.out.print("Size : ");
                int size= sc.nextInt();
                System.out.print("Price : ");
                int price= sc.nextInt();
                ((WareHouseManager)whm).addItemToWareHouse(new Shoe(brand,name,price,size,color));
            }
            else if (pil==2){
                Size s = null;
                sc.nextLine();
                System.out.print("Brand : ");
                String brand= sc.nextLine();
                System.out.print("Name : ");
                String name= sc.nextLine();
                System.out.print("Size (XS, S, M, L, XL, XXL) : ");
                String size= sc.next();
                if (size.equals(String.valueOf(Size.XS))){
                    s = Size.XS;
                }
                else if (size.equals(String.valueOf(Size.S))){
                    s = Size.S;
                }
                else if (size.equals(String.valueOf(Size.M))){
                    s = Size.M;
                }
                else if (size.equals(String.valueOf(Size.L))){
                    s = Size.L;
                }
                else if (size.equals(String.valueOf(Size.XL))){
                    s = Size.XL;
                }
                else if (size.equals(String.valueOf(Size.XXL))){
                    s = Size.XXL;
                }
                System.out.print("Price : ");
                int price= sc.nextInt();
                ((WareHouseManager)whm).addItemToWareHouse(new Shirt(brand,name,price,s));
            }
            else if (pil==3){
                ((WareHouseManager)whm).viewItemInWareHouse();
            }
        }while(pil!=4);
    }
}
