package questions;

/**
 * @author Ivan Lifanica
 */
public class Tribonacci {

    //t(x) = t(n-1) + t(n-2) + t(n-3)
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    private static int tribonacci(int num){
        return (memoized(new int [num +1], num));
    }

    public static int memoized(int [] tribonacciCache, int num){
        if(num <= 0) return 0;
        if(num <= 2) return 1;
        if(tribonacciCache[num] != 0)
            return tribonacciCache[num];
        tribonacciCache[num] = (memoized(tribonacciCache,num-1) + memoized(tribonacciCache,num-2) + memoized(tribonacciCache,num-3));
        return tribonacciCache[num];
    }
}
