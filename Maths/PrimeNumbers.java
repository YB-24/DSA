package com.yash;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(14));
        for (int i = 0; i < 21; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i =2; i*i <=n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
