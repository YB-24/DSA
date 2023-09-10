package com.yash;

public class N_Queen {
    public static void main(String[] args) {
        boolean[][] boo = new boolean[4][4];
        System.out.println( queen(boo,0));
    }
    static int queen(boolean[][] b , int row){
        if (row==b.length){
            display(b);
            System.out.println();
            return 1;
        }
        int count = 0;

        for (int i = 0; i < b.length; i++) {
            if (isSafe(b,row,i)){
                b[row][i]=true;
              count=count+queen(b,row+1);
                b[row][i]=false;
            }

        }
        return count;
    }

    private static boolean isSafe(boolean[][] bo,int row,int col) {
        for (int i = 0; i <row; i++) {
            if (bo[i][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(bo[row-i][col-i]) {
                return false;
            }
        }

        int maxRight = Math.min(row, bo.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(bo[row-i][col+i]) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board){
        for (boolean[] booleans : board) {
            for (int j = 0; j < board[0].length; j++) {
                if (booleans[j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}