package questions;

import javax.xml.stream.events.Characters;
import java.util.Locale;

/**
 * @author Ivan Lifanica
 */

//A phrase is a palindrome if, after converting all uppercase letters into
// lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
public class ValidPalindrome {

    public static void main(String[] args) {
        String s  = replaceString("");
        System.out.println(replaceString(s).equals(validPalindrome("A man, a plan, a canal: Panama")));

    }

    public static String validPalindrome(String s) {
       return validPalindromeUppercase(new String [s.length()], replaceString(s));
    }

    public static String replaceString(String s){
        return s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
    }

    public static String validPalindromeUppercase(String [] stringCache, String s){
        if (s == null || s.isEmpty())
            return s;
        if(stringCache[s.length()] != null) return stringCache[s.length()];
        stringCache[s.length()] = s.charAt(s.length() - 1 ) + validPalindromeUppercase(stringCache,s.substring(0, s.length() - 1));
        return stringCache[s.length()];
    }

}
