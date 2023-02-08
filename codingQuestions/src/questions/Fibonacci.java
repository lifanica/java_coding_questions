package questions;

/**
 * @author Ivan Lifanica
 */
public class Fibonacci {

    public static long [] fibonacciCache;
    public static void main (String []args){
        int n = 7;
        fibonacciCache = new long[n + 1];
        for (int i = 0;i<=n; i++)
        System.out.println(fibonacci(i));
    }



    public static long fibonacci(int num){
        if(num <= 1 ) return num;
            if(fibonacciCache[num] != 0)
                return fibonacciCache[num];
            fibonacciCache[num] = (fibonacci(num - 1) + fibonacci(num - 2));
        return fibonacciCache[num];
    }
}
