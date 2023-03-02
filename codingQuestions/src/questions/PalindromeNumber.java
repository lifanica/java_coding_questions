/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

/**
 * @author Ivan Lifaniça
 */

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }


    public static boolean isPalindrome(int number){
        if(number<0) return false;
        int rev = 0, copy = number;

        while (copy>0) {
            int mostRightN = copy % 10;
            rev = rev * 10 + mostRightN;
            copy /=10;
        }

        return rev == number;
    }
}
