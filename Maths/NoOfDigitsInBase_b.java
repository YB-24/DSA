package com.yash;

public class NoOfDigitsInBase_b {
    public static void main(String[] args) {
        System.out.println(digits(16));
    }
    static int digits(int n){
        return (int)(Math.log(n)/Math.log(2))+1;   //if we want for base b just replace 2 by b
    }
}
