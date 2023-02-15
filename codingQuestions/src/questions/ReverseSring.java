package questions;

/**
 * @author Ivan Lifanica
 */
public class ReverseSring {

    //rev(abcde) = c + b + a = cba
    //rev(s) = char(s.length -1 ) + rev(s whithout last character)
    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));

    }


    public static String reverseString(String s){
        if(s == null || s.length() == 0)
            return s;
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }

    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }



}
