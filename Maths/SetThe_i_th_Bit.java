package com.yash;

public class SetThe_i_th_Bit {   //means set i'th bit to 1
    public static void main(String[] args) {
        System.out.println(setBit(6,4));
    }
    static int setBit(int n,int i){
        return n|(1<<(i-1));
    }
}
