package com.yash;

public class XOR_Of_Numbers {
    public static void main(String[] args) {
        System.out.println(xor(10));
        System.out.println(xor2(3,9));
    }
    //from 0 to n
    public static int xor(int n){
        if (n%4==0){
            return n;
        }
        if (n%4==1){
            return 1;
        }
        if (n%4==2){
            return n+1;
        }
        return 0;
    }
    //from a to n
    public static int xor2(int a , int n){
        return xor(n)^xor(a-1);
    }
}
