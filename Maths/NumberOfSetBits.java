package com.yash;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = 1059;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(numberOfSetBits(n));
    }
        public static int numberOfSetBits(int n){
        int counter=0;
        //Method 1
//        while (n>0){
//          counter++;
//          n-=(n&-n);
//        }
        //Method 2
            while (n>0){
                counter++;
                n=n&(n-1);
            }
        return counter;
        }
}
