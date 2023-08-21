package com.yash;

public class Patterns {
    public static void main(String[] args) {
        pattern(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
    }

    public static void pattern(int n) {
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                int ans = Math.min(Math.min(row - 1, col - 1), Math.min((2 * n - 1) - row, (2 * n - 1) - col));
                int original = n - ans;
                System.out.print(original + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= 2 * n; col++) {
                int ans = Math.min(2 * n - col + 1, col);
                if (ans <= row) {
                    System.out.print(ans + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
//alternative for pattern 2 and same reverse extension
    public static void pattern3(int n) {
        for (int row = 1; row < 2*n; row++) {
            int r=row>n?2*n-row:row;
            for (int col = 1; col <= n; col++) {
                if (col <= r) {
                    System.out.print(col + " ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = n + 1; col <= 2 * n; col++) {
                if (2 * n - col +1<= r) {
                    System.out.print(2 * n - col+1 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int r=row>n?2*n-row:row;
            for (int col = 1; col <= n; col++) {
                if (col <= r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = n + 1; col <= 2 * n; col++) {
                if (2 * n - col +1<= r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

