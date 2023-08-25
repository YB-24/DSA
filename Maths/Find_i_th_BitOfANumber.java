package com.yash;

public class Find_i_th_BitOfANumber {
    public static void main(String[] args) {
        System.out.println(bitNo(6,5));
        System.out.println(bitNoUsingMask(6,5));
    }
    static int bitNo(int n, int i){          //this returns 0 or 1
        n=n>>(i-1);
        return n&1;
    }
    static int bitNoUsingMask(int n, int i){   //this returns value of that bit
        return n&(1<<(i-1));
    }

}
