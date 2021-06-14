/**
 * @author Kevin Juan (1972002)
 */
package com.kevinjuan.data;

import com.kevinjuan.exceptions.ArrayException;
import java.util.Arrays;

public class ArrayOfNumber {
    private Integer[] number;
    public void constructArray() throws ArrayException {
        if (number==null){
            number=new Integer[0];
            System.out.println("Creating new array");
        }
        else {
            throw new ArrayException("Array telah dibuat");
        }
    }
    public void increaseArrayIndex(){
        if (number.length==0){
            number = Arrays.copyOf(number,number.length+1);
            number[number.length-1] = 0;
            System.out.println("Array berhasil ditambah");}
        else{
            number = Arrays.copyOf(number,number.length+1);
            System.out.println("Array berhasil ditambah");
        }
    }
    public void addValueToArray(int index, Integer value){
        number[index] = value;
    }
    public void showArray() {
        if (number == null) {
            throw new NullPointerException("Array belum dibuat");
        } else System.out.println("Isian Array : " + Arrays.toString(number));
    }
}

