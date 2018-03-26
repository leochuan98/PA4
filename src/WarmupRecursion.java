/**
 * File: WarmupRecursion.java
 * Author: Gustavo Umbelino, Carlos Mattoso and TODO add your name(s)!
 * Date: 5/24/2017
 * Description: TODO describe this class!
 *
 * IMPORTANT: If you don't implement a method, DO NOT delete it.
 */

import java.util.ArrayList;
import java.util.Random;

public class WarmupRecursion {

    /**
     * TODO
     *  
     * @param n
     * @return
     */
    public static String binaryString(int n) {
        if (n/2==0) return ""+n;
        return binaryString(n/2)+""+n%2;
    }

    /**
     * TODO
     *
     * @param digits
     * @return
     */
    public static String generateRandomMnemonic(String digits) {
        if(digits.isEmpty()||digits==null) {
            return "";
        } else {
            String s = getCode(digits.charAt(0));
            if (s==""){
                return ""+generateRandomMnemonic(digits.substring(1));
            }
            return s.charAt(new Random().nextInt(s.length())) + generateRandomMnemonic(digits.substring(1));
        }
    }

    private static String getCode(char A) {
        switch (A) {
            case '2':
                return "ABC";
            case '3':
                return "DEF";
            case '4':
                return "GHI";
            case '5':
                return "JKL";
            case '6':
                return "MNO";
            case '7':
                return "PQRS";
            case '8':
                return "TUV";
            case '9':
                return "WXYZ";
            default:
                return "";

        }
    }



    /**
     * TODO
     *
     * @param set
     * @param targetNumber
     * @return
     */
    static boolean  toright =true;
    public static boolean isSubSetSum(ArrayList<Integer> set, int targetNumber) {

        if (set.size() == 1) {
            return (set.get(0) == targetNumber);
        }

        //base case 2: if the last item equals the target return true
        int lastItem = set.get(0);
        if (lastItem == targetNumber) {
            return true;
        }

        //make a new set by removing the last item
        ArrayList newset=set;
        newset.remove(0);

        //recursive case: return true if the subset adds up to the target
        //                OR if the subset adds up to (target - removed number)
        return (isSubSetSum( newset,targetNumber))|| isSubSetSum( newset,targetNumber - lastItem);
    }

}
