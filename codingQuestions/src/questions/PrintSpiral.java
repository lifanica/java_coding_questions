/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

/**
 * @author Ivan Lifaniça
 */

public class PrintSpiral {

    public static void printSpiral(int[][] mat, int top, int bottom,
                                   int left, int right)
    {
        // base case
        if (mat == null || mat.length == 0 || left > right) {
            return;
        }

        // print top row
        for (int i = left; i <= right; i++) {
            System.out.print(mat[top][i] + " ");
        }
        top++;

        if (top > bottom) {
            return;
        }
        // print right column
        for (int i = top; i <= bottom; i++) {
            System.out.print(mat[i][right] + " ");
        }
        right--;

        if (left > right) {
            return;
        }
        // print bottom row
        for (int i = right; i >= left; i--) {
            System.out.print(mat[bottom][i] + " ");
        }
        bottom--;

        if (top > bottom) {
            return;
        }
        // print left column
        for (int i = bottom; i >= top; i--) {
            System.out.print(mat[i][left] + " ");
        }
        left++;

        printSpiral(mat, top, bottom, left, right);
    }
}
