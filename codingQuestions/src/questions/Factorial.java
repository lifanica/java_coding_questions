package questions;

/**
 * @author Ivan Lifanica
 */
public class Factorial {

    //5! = 5 * 4 * 3 * 2 * 1 = 120
    //factorial(n) = n * factorial(n-1)
    public static void main(String []args){
        System.out.println(factorial(5));
    }


    public static long factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
        }
    }

