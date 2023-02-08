package questions;

/**
 * @author Ivan Lifanica
 */
public class ReverseSring {

    //rev(abc) = c + b + a = cba
    //rev(s) = charAt(s.length - 1) + rev(s without last char)
    public static void main(String[] args) {
        System.out.println(isPalindrome("ana"));

    }

    private static String reverse(String s) {
        if (s == null || s.isEmpty())
            return s;
        return s.charAt(s.length() - 1 ) + reverse(s.substring(0, s.length() - 1));
    }

    private static boolean isPalindrome(String s){
        return s.equals(reverse(s));
    }
}
