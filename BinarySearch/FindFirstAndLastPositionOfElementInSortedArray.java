package com.yash;
//leetcode problem number 34
import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
    public static int[] searchRange(int[] letters, int target) {
        int start = 0;
        int temp=0;
        int end = letters.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(letters[mid]==target){
                temp=mid;
                while(letters[mid]==target && mid>0 ){
                    if(letters[mid-1]==target){
                        mid--;
                    }else {
                        break;
                    }
                }
                while(letters[temp]==target && temp<letters.length-1){

                    if(letters[temp+1]==target){
                        temp++;

                    }else {
                        break;
                    }
                }
                return new int[]{mid,temp};
            }
            if (letters[mid]>target){
                end=mid-1;
            }
            if(letters[mid]<target){
                start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
