package com.yash;

public class EvenNoOfDigitsInArrayElement {
    public static void main(String[] args) {
    int[] array =  {1,12,3,56,896,-6548,78,586,0,6};
        System.out.println(check(array));
        countNoOfNumbers(-3265988);
    }
    static int check(int[] arr){
        int count=0;
        for (int element:arr){
            int noOfDigits=0;
            if (element<0){
                element=element*(-1);
            }
            if (element==0){
                count++;
            }
            while (element>0){
                noOfDigits++;
                element=element/10;
            }
            if (noOfDigits%2==0){
                count++;
            }
        }
        return count;
    }
    //Another way to count number of digits in decimal number system--fast way than using while loop
    static void countNoOfNumbers(int num){
        if (num<0){
            num=num*(-1);
        }
        int number = ((int) Math.log10(num))+1;
        System.out.println(number);
    }
}
