package com.yash;

public class SquareRoot {
    public static void main(String[] args) {
       System.out.println(mySqrt(2147395600));
    }
    public static int mySqrt(int x) {
        int ans = 0;
        long square= (long) x;
        long sqrt=0;
    while((sqrt)<=square){
        ans++;
        sqrt= (long)ans*ans;

    }

    return ans-1;
    }

}