/**
 * @author Kevin Juan (1972002)
 */
package com.kevinjuan.main;

import com.kevinjuan.data.ArrayOfNumber;
import com.kevinjuan.exceptions.ArrayException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) throws ArrayException {
        Scanner scanner = new Scanner (System.in);
        int pil;
        ArrayOfNumber arrays = new ArrayOfNumber();
        do {
            System.out.println("========================================");
            System.out.println("1. Make Array");
            System.out.println("2. Add length to array");
            System.out.println("3. Insert new data to array");
            System.out.println("4. Show array");
            System.out.println("0. Exit");
            System.out.print("Choice : ");
            pil = scanner.nextInt();
            if (pil == 1) {
                try{
                    arrays.constructArray();
                }catch (ArrayException e){
                    System.out.println("Array telah dibuat");
                }
            } else if (pil == 2) {
                try{
                    arrays.increaseArrayIndex();
                } catch(NullPointerException e){
                    System.out.println("Array belum dibuat");
                }
            } else if (pil == 3) {
                try {
                    try {
                        System.out.print("Index : ");
                        int index = scanner.nextInt();
                        System.out.print("Number : ");
                        int number = scanner.nextInt();
                        arrays.addValueToArray(index, number);
                    }catch (InputMismatchException e) {
                        System.out.println("Input harus bilangan");
                        scanner.next();
                    }
                } catch(NullPointerException e){
                    System.out.println("Array belum dibuat");
                } catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Index yang dimasukkan tidak ada pada array");
                }
            } else if (pil == 4) {
                try {
                    arrays.showArray();
                } catch (NullPointerException e){
                    System.out.println("Array belum dibuat");
                }
            }
        } while(pil != 0);
    }
}
