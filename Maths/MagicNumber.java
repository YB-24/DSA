package com.yash;

public class MagicNumber {   //the number in binary form when converted by multiplying power of 5 from power 1 to decimal
    public static void main(String[] args) {
        System.out.println(magic(10));
    }
    public static int magic(int n){
        int ans=0;
        int counter=5;
        while (n>0){
            if ((n&1)==1){
             ans=ans+counter;
            }
            n=n>>1;
            counter*=5;
        }
        return ans;
    }
}
