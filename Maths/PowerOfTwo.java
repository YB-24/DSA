package com.yash;

public class PowerOfTwo {  //to find out whether no. is power of two or not e.g. 2^3,2^6,etc
    public static void main(String[] args) {
        int n = 32;
        boolean isPower = (n&(n-1))==0;  //make separate case for zero
        if(n==0){
            isPower=false;
        }
        System.out.println(isPower);
    }

}
