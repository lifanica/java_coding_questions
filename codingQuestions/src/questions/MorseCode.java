/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Lifaniça
 */

public class MorseCode {

    public int morseCode(String[] words){
        Map<Character, String> dicionary = getDicionary();
        boolean exit = true;
        boolean controller = false;
        int refPositionWord = 0;
        int refPositionChar = 0;
        int transformations = 1;
        do{
            for(int i =0 ; i< words.length; i++){
                if(i+1 < words.length) {
                    if (refPositionChar < words[i + 1].toCharArray().length && words[i].toCharArray().length > 0 && refPositionChar < words[refPositionWord].toCharArray().length) {
                        dicionary.get(words[refPositionWord].charAt(words[i + 1].charAt(refPositionChar)));
                        if (!dicionary.get(words[refPositionWord].charAt(refPositionChar)).equals(dicionary.get(words[i + 1].charAt(refPositionChar)))) {
                            transformations ++;
                        }
                    }
                    }
            }

        }while(exit);

        return 1;
    }

    private Map<Character, String> getDicionary(){
        String[] alphabet = new String [] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> dicionary = new HashMap<>();
        int aschiValue = 97;
        for (String s : alphabet) {
            char ch = (char) aschiValue;
            dicionary.put(ch, s);
            aschiValue++;
        }
        return dicionary;
    }
}
