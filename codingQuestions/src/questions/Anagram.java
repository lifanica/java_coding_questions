/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

/**
 * @author Ivan Lifaniça
 */


//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging
// the letters of a different word or phrase, typically using all the original letters exactly once.

//Input: s = "anagram", t = "nagaram"  //ana ann // car rac // ccar arrc
//Output: true
public class Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaraa"));

       // System.out.println("hello.ivan,".replaceAll("[^A-Za-z]",""));



    }

    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;

        int [] letterCounter = new int[26];

        for(int i = 0; i< s.length(); i++) letterCounter[s.charAt(i) - 'a']++;
        for(int i = 0; i< s.length(); i++) letterCounter[s.charAt(i) - 'a']--;

        for(int letter : letterCounter)
            if(letter>0) return false;
        return true;
    }


}
