package com.yash;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        sudoku(board);
    }
    static void sudoku(int[][] board){
        boolean isEmpty=false;
        int r=-1;
        int c=-1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j]==0){
                    isEmpty=true;
                    r=i;
                    c=j;
                    break;
                }
            }
            if (isEmpty){
                break;
            }
        }

        if (!isEmpty){
            display(board);
            System.out.println();
            return;
        }


        for (int i = 1; i <10 ; i++) {
            if (isSafe(board,r,c,i)){
                board[r][c]=i;
                sudoku(board);
                board[r][c]=0;
            }
        }

    }

    private static boolean isSafe(int[][] board, int r, int c, int i) {
        for (int j = 0; j < 9; j++) {
            if (board[r][j]==i){
                return false;
            }
        }
        for (int j = 0; j < 9; j++) {
            if (board[j][c]==i){
                return false;
            }
        }
        int squareStartRow=r-(r%3);
        int squareStartCol=c-(c%3);
        for (int j = squareStartRow; j <squareStartRow+3 ; j++) {
            for (int k = squareStartCol; k <squareStartCol+3 ; k++) {
                if (board[j][k]==i){
                    return false;
                }
            }
        }
        return true;
    }
    private static void display(int [][] board) {
        for (int[] arr:board){
            for (int e:arr){
                System.out.print(e+ " ");
            }
            System.out.println();
        }
    }
}