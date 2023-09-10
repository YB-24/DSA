package com.yash;

public class DiceProblem {
    public static void main(String[] args) {
        diceCombinations("",5);
        System.out.println(diceCombinationsCount("",5));
    }
    static void diceCombinations(String p , int target){
        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=target && i<=6 ; i++) {
                diceCombinations(p+i,target-i);
        }
    }
    static int diceCombinationsCount(String p , int target){
        if (target==0){
            return 1;
        }
        int count= 0;
        for (int i = 1; i <=target && i<=6 ; i++) {
                count=count+diceCombinationsCount(p+i,target-i);
        }
        return count;
    }
}