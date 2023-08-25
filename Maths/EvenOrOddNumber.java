package com.yash;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        System.out.println(isOdd(3));
    }
    public static boolean isOdd(int n){
        if ((n&1)==1){
            return true;
        }else {
            return false;
        }
    }
}
