package questions;

/**
 * @author Ivan Lifaniça
 */

public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public String longestPrefix(String [] strs){
        boolean controler = true;
        int refPositionWord = 0;
        int refPositionChar = 0;
        StringBuilder prefix = new StringBuilder();
        if(strs.length == 1)
            if(strs[0].toCharArray().length == 0)
            return "";
            else
                return String.valueOf(strs[0].charAt(0));



        do{
            for(int i = 0; i < strs.length; i++){
                if(i+1 < strs.length) {
                    if (refPositionChar < strs[i + 1].toCharArray().length && strs[i].toCharArray().length > 0 && refPositionChar < strs[refPositionWord].toCharArray().length) {
                        if (strs[refPositionWord].charAt(refPositionChar) != strs[i + 1].charAt(refPositionChar)) {
                            controler = false;
                            break;
                        }
                    } else {
                        controler = false;
                        break;
                    }
                }
            }
            if(controler)
                prefix.append(strs[refPositionWord].charAt(refPositionChar));
            refPositionChar ++;

        }while(controler);
        return prefix.toString();
    }
}
