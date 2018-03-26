/**
 * File: Recursion.java
 * Author: Gustavo Umbelino, Sriram Manohar, Carlos Mattoso, and TODO add your name(s)!
 * Date: 5/24/2017
 * Description: TODO describe this class!
 */

import java.util.ArrayList;

public class Recursion {

    /**
     * TODO: write method header if you choose to implement it
     *
     *  IMPORTANT: If you don't implement, DO NOT delete this method.
     */
    public static double humanPyramidWeight(ArrayList<ArrayList<Double>> weights,
                                            int level, int offset) throws Exception {
        return 1.0;
    }

    /**
     * TODO: write method header if you choose to implement it
     *
     *  IMPORTANT: If you don't implement, DO NOT delete this method.
     */
    public static ArrayList<String> generateMnemonics(String number) {
        ArrayList<String> a=new ArrayList();
        if(number.isEmpty()) {
            return a;
        } else {
            String s = getCode(number.charAt(0));
            if (s==""){
                return generateMnemonics(number.substring(1));
            }
            for (int i=0;i<s.length();i++){
                return generateMnemonics(number.substring(1));
            }

        }
        return null;
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
     * TODO: write method header if you choose to implement it
     *
     *  IMPORTANT: If you don't implement, DO NOT delete this method.
     */
    static int Max(int a, int b)
    {
        return a > b ? a : b;
    }
    public static int collectCoins2D(int[][] board, int row, int col) {

            int cols = board[0].length; // To find number of columns in a matrix
            int rows = board.length; // To find number fo rows in a matrix
            if (col >= cols || row >= rows) // To check out off grid access
                return -1;
            else if (row == (rows - 1) && col == (cols - 1)) // To check right most cell in grid
                return board[row][col];
            else {

             // collectCoins2D(cost, m + 1, n)---> Moving Down
             // collectCoins2D(cost, m, n + 1) ---> Moving Right
                return board[row][col] + Max(collectCoins2D(board, row + 1, col), collectCoins2D(board, row, col + 1));
            }

    }

    /**
     * TODO: write method header if you choose to implement it
     *
     *  IMPORTANT: If you don't implement, DO NOT delete this method.
     */
    public static int collectCoins1D(int[] m) {
        return 0;
    }

    private static int collectMaxCoinsHelp(int[] m, int start, int end) {
        return 0;
    }

}