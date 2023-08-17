package com.yash;
//leetcode problem no--268
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array={5,4,0,1,3,6};
        int a=cycle(array);
        System.out.println(Arrays.toString(array));
        System.out.println(a);
    }
    public static int cycle(int[] arr){
       int i=0;
       int ans=0;
        while (i<arr.length){
            if (arr[i]==0){
                ans=i+1;
                i++;
                continue;
            }
            if (arr[i]-1!=i){
                swap(arr,arr[i]-1,i );
            }else {
                i++;
            }
        }
        return ans;
    }
    static void swap(int[] array,int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}