package com.yash;

public class FindTheNumberNotAppearingTwice {
    public static void main(String[] args) {
        int[] array={2,6,7,9,2,11,6,9,7};
        System.out.println(notTwice(array));
    }
    public static int notTwice(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length ; i++) {
            ans^=arr[i];
        }
        return ans;
    }
}
