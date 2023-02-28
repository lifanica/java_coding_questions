package questions;

/**
 * @author Ivan Lifanica
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(10));
    }

    static public boolean isPrime(int number){
        if(number == 1) return false;
        for(int i = 2; i< Math.sqrt(number) ; i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
