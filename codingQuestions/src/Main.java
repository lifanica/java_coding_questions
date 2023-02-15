import questions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * @author Ivan Lifaniça
 */
interface TestA{
    String toString();
}
public class Main {
    static public  void main(String [] args){

//        LongestPrefix t = new LongestPrefix();
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter a ROMAN number: ");
////        String s = scanner.nextLine();
//        ContainsDuplicate m = new ContainsDuplicate();
//        System.out.println(m.containsDuplicateV1(new int[]{1,0,1,1}));
//        //System.out.println(Arrays.toString(t.twoSumWithMap(new int[]{2, 5, 5, 11}, 10)));

//        PrimeNumbers primeNumbers = new PrimeNumbers();
//        IntStream.range(1,100).forEach(value -> {
//            if(primeNumbers.isPrime(value))
//                System.out.println(value);
//        });

        Fibonacci f = new Fibonacci();
        //System.out.println(f.fibonacci(6));


        //
//        Map<String, Integer> nameMap = new HashMap<>();
//        nameMap.put("John", 12);
//        Integer value = nameMap.computeIfAbsent("Johns", String::length);
//        System.out.println(value);


//        System.out.println(new TestA(){
//            public String toString(){
//                return "test";
//            }
//        });

//
//        Function<Integer, String> intToString = Object::toString;
//        Function<String, String> quote = s -> "'" + s + "'";
//
//        Function<Integer, String> quoteIntToString = quote.compose(intToString);
//
//
//        System.out.println(quoteIntToString.apply(5));

    }
}

