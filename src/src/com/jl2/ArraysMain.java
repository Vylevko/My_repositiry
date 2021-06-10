package com.jl2;

import java.util.Scanner;

import static java.lang.System.out;

public class ArraysMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the array length");
        int length = scan.nextInt();
        ArraysMax array = new ArraysMax(length);
        for( int i = 0; i < length; i++) {
            System.out.println("Insert value");
            int a = scan.nextInt();
            array.setArrayValues(a,i);
        }
        array.showArrayValues();
        //System.out.println("Insert Order way A,D");
       // char way = scan.next().charAt(0);
        //array.orderArrayBubbble(way);
        //array.showArrayValues();
        out.println(3);
        //array.showArray(array.orderArrayFastStep1(array.returnArray(), 3));

    }
	// write your code here

}
