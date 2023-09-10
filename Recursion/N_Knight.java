package com.yash;

public class N_Knight {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, 4);
    }
    static void knights(boolean[][] board,int r,int c,int target){
        if (target==0){
            display(board);
            System.out.println();
            return;
        }
        if (r==board.length-1 && c==board.length ){
            return;
        }

        if (c== board.length){
            knights(board, r+1, 0, target);
            return;
        }


            if (isSafe(board,r,c)) {
                board[r][c] = true;
                knights(board, r, c + 1, target - 1);
                board[r][c] = false;

            }
        knights(board, r, c+1, target);
    }

    private static boolean isSafe(boolean[][] board, int r, int i) {
        if (isValid(board,r-2,i-1)){
           if (board[r-2][i-1]) {
               return false;
           }
        }
        if (isValid(board,r-2,i+1)){
            if (board[r-2][i+1]) {
                return false;
            }
        }
        if (isValid(board,r-1,i-2)){
            if (board[r-1][i-2]) {
                return false;
            }
        }
       if (isValid(board,r-1,i+2)){
           if (board[r-1][i+2]) {
               return false;
           }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int r, int c){
        if (r>=0 && r<board.length && c>=0 && c<board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] arr:board){
            for (boolean e:arr){
                if (e){
                    System.out.print("K ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
