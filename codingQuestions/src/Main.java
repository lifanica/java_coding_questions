import questions.*;

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
        ContainsDuplicate m = new ContainsDuplicate();
        System.out.println(m.containsDuplicateV1(new int[]{1,0,1,1}));
        //System.out.println(Arrays.toString(t.twoSumWithMap(new int[]{2, 5, 5, 11}, 10)));
    }
}

