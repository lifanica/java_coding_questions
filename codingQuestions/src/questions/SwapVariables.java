/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

/**
 * @author Ivan Lifaniça
 */

public class SwapVariables {

    public static void main(String[] args) {
        swapVariables("ana","jon", 0);
    }

    public static void swapVariables(String a, String b, int swapPoint){
        swapPoint = a.length() ;
        a = a+b;
        b = a.substring(0,swapPoint);
        a = a.replaceAll(b,"");

        System.out.print("a: "+ a + " b: " +b );


    }
}
