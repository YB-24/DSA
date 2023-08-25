package com.yash;

public class PositionOfRightmostSetBit {
    public static void main(String[] args) {
        System.out.println(position(6));
    }
    static int position(int n){
        return n&(-n);
    }
}
