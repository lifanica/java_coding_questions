/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Ivan Lifaniça
 */

public class ReverseSentence {


    public static void main(String[] args) {
        reverseString("geeks quiz practice code");
    }

    public static void reverseString(String sentence) {

        String[] listOfWords = sentence.split(" ");
        StringBuilder reversedWord = new StringBuilder();
        for (int i = listOfWords.length - 1; i >= 0; i--) {
            reversedWord.append(" ");
        }
        System.out.print(reversedWord);

    }
}
