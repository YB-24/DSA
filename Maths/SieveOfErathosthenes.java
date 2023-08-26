package com.yash;

public class SieveOfErathosthenes {
    public static void main(String[] args) {
      sieve(40);
    }
    public static void sieve(int n){
        boolean[] arr = new boolean[n+1];
        for (int i = 2; i*i <=n ; i++) {
            if (!arr[i]){
                for (int j = 2*i; j <=n ; j=j+i) {
                    arr[j]=true;
                }
            }
        }
        for (int i = 2; i <arr.length ; i++) {
            if (arr[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}
