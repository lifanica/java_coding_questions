/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

/**
 * @author Ivan Lifaniça
 */

public class BinarySearch {

    //1 2 3 4 5 6 7
    public static void main(String[] args) {
        int x= 64;
        //1000000
        System.out.println("x >>> 3 = "  + (x >>> 2));
        System.out.println("x >> 3 = "  + (x << 2));
        System.out.println(Integer.toBinaryString(x >>> 1));
        System.out.println(Integer.toBinaryString(x << 1));
        System.out.println(Integer.toBinaryString(x ));

        //System.out.print(binarySearch(new int[]{1,2,3,4,5,6,7}, 1));
    }

    public static int binarySearch(int [] numbers, int number){
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while(leftPointer <= rightPointer) {
            int midle = (leftPointer + rightPointer) >>> 1;
            int midleNumber = numbers[midle];

            if(number == midleNumber) return midle;

            else if(number < midleNumber) rightPointer = midle - 1;

            else leftPointer = midle + 1 ;

        }
        return -1;
    }

}
