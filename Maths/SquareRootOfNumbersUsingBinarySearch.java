package com.yash;

public class SquareRootOfNumbersUsingBinarySearch {
    public static void main(String[] args) {
        System.out.println(sqrt(21,6));
    }
    public static double sqrt(int n, int p){
        int s = 0;
        int e = n;
        double root = 0.0;
        while (s<=e){
            int m = s + (e-s)/2;
            if (m*m == n){
                return m;
            }
            if (m*m>n){
                e=m-1;
            }else {
                s=m+1;
            }
        }
        root=e;
        double incr = 0.1;
        for (int i = 1; i <=p ; i++) {
            while (root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
