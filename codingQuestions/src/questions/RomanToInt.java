package questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
*<p>
*Symbol       Value
*I             1
*V             5
*X             10
*L             50
*C             100
*D             500
*M             1000
 * <p>
*For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
*<p>
*Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
*<p>
*I can be placed before V (5) and X (10) to make 4 and 9.
 * <p>
*X can be placed before L (50) and C (100) to make 40 and 90.
 * <p>
*C can be placed before D (500) and M (1000) to make 400 and 900.
 * <p>
*Given a roman numeral, convert it to an integer.
 * <p>
 *     <blockquote><pre>
*Example 1:
*
*Input: s = "III"
*Output: 3
*Explanation: III = 3.
 * </pre></blockquote><p>
 *     <blockquote><pre>
*Example 2:
*
*Input: s = "LVIII"
*Output: 58
*Explanation: L = 50, V= 5, III = 3.</pre></blockquote><p>
 *     <blockquote><pre>
*Example 3:
*
*Input: s = "MCMXCIV"
*Output: 1994
*Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*</pre></blockquote><p>
*
*Constraints:
*<p>
*1 <= s.length <= 15
 *<p>
*s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * <p>
*It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 *
 * @author Ivan Lifaniça
 */
public class RomanToInt {

    public int romanToInt(String romanValue){
        Map<String, Integer> dicionary = new LinkedHashMap<>();
        dicionary.put("I",1);
        dicionary.put("V",5);
        dicionary.put("X",10);
        dicionary.put("L",50);
        dicionary.put("C",100);
        dicionary.put("D",500);
        dicionary.put("M",1000);
        Integer integerValue = 0;
        String stringValue;
        String stringValue1;
        List<String> keys = new ArrayList<>(dicionary.keySet());


        for(int i = 0; i < romanValue.toCharArray().length; i++) {
            stringValue = String.valueOf(romanValue.charAt(i));
            if ("IXC".contains(stringValue)) {
                if(i+1 == romanValue.toCharArray().length)
                    return integerValue + dicionary.get(stringValue);
                stringValue1 = String.valueOf(romanValue.charAt(i+1));
                if(stringValue1.equals(keys.get(keys.indexOf(stringValue)+1)) ||
                        stringValue1.equals(keys.get(keys.indexOf(stringValue)+2))){
                    integerValue -= dicionary.get(stringValue);
                }else{
                    integerValue += dicionary.get(stringValue);
                }
            }
            else{
                integerValue += dicionary.get(stringValue);
            }
        }
        return integerValue;
    }



    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Finds decimal value of a
    // given roman numeral
    int romanToIntt(String str)
    {
        // Initialize result
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            // Getting value of symbol s[i]
            int s1 = value(str.charAt(i));

            // Getting value of symbol s[i+1]
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                // Comparing both values
                if (s1 >= s2) {
                    // Value of current symbol
                    // is greater or equalto
                    // the next symbol
                    res = res + s1;
                }
                else {
                    // Value of current symbol is
                    // less than the next symbol
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }

        return res;
    }

}
