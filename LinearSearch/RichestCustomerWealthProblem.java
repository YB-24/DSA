package com.yash;

public class RichestCustomerWealthProblem {
    public static void main(String[] args) {
        int[][] accounts = {{1,3,3},{3,2,1}};
        System.out.println(max(accounts));
    }
    public static int max(int[][] arr){
        int maxWealth = 0;
        for (int[] array:arr) {
            int sum=0;
            for (int element:array) {
                sum+=element;
            }
            if (sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
}
