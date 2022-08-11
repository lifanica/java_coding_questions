import questions.RomanToInt;
import java.util.Scanner;

/**
 * @author Ivan Lifaniça
 */

public class Main {
    public static void main(String [] args){

        RomanToInt t = new RomanToInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ROMAN number: ");
        String s = scanner.nextLine();
        System.out.println(t.romanToInt(s));
        //System.out.println(Arrays.toString(t.twoSumWithMap(new int[]{2, 5, 5, 11}, 10)));
    }
}
