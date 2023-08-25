package com.yash;

public class ResetThe_i_th_Bit {   //means set i'th bit to 0
    public static void main(String[] args) {
        System.out.println(resetBit(10,2));
    }
    static int resetBit(int n,int i){
        return n&~(1<<(i-1));
    }
}
