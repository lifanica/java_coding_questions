/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ivan Lifaniça
 */

public class MorseCode {

    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }

    public int morseCode(String[] words){
        Map<Character, String> dicionary = getDicionary();

        Set<String> transformation = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(dicionary.get(c));
            transformation.add(code.toString());
        }

        return transformation.size();
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
