package com.yash;

public class PascalsTriangle {
    //it starts from row indexed 0
    //every row has numbers from (row combinatorics 0) to (row combinatorics row)
    //sum of row is equal to 2^row
    public static void main(String[] args) {
        System.out.println(sumOfRow(5));
    }
    static int sumOfRow(int n){
        return 1<<n;
    }


}
