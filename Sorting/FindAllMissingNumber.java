package com.yash;
//leetcode problem no--448
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] array={4,3,2,7,8,2,3,1};
        ArrayList<Integer> a=cycle(array);
        System.out.println(Arrays.toString(array));
        System.out.println(a);
    }
    public static ArrayList<Integer> cycle(int[] arr){
       int i=0;
      ArrayList<Integer> ans =new ArrayList<Integer>();
        while (i<arr.length){
            if (arr[i]-1!=i && arr[i]!=arr[arr[i]-1]){
                swap(arr,arr[i]-1,i );
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans.add(j+1);
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