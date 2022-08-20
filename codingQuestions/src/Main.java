import questions.LongestPrefix;
import questions.MorseCode;
import questions.RomanToInt;
import questions.ValidParentheses;

import java.util.Scanner;

/**
 * @author Ivan Lifaniça
 */

public class Main {
    public static void main(String [] args){

        LongestPrefix t = new LongestPrefix();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a ROMAN number: ");
//        String s = scanner.nextLine();
        ValidParentheses m = new ValidParentheses();
        System.out.println(m.isValid("()"));
        //System.out.println(Arrays.toString(t.twoSumWithMap(new int[]{2, 5, 5, 11}, 10)));
    }
}

