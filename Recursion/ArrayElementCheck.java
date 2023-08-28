package com.yash;

public class ArrayElementCheck {
    public static void main(String[] args) {
        int[] array = {25,21,4,4,5,9,15};
        System.out.println(check(array,4,0));
        System.out.println(checkAndReturnIndex(array,4,0));
        System.out.println(checkFromLast(array,4,array.length-1));
    }
    public static boolean check(int[] arr , int element , int index){
        if (index>arr.length-1||index<0){
            return false;
        }
        return arr[index]==element || check(arr, element, index+1);
    }
    public static int checkFromLast(int[] arr , int element , int index){
        if (index>arr.length-1||index<0){
            return -1;
        }if (arr[index]==element){
            return index;
        }
        return  checkFromLast(arr, element, index-1);
    }
    public static int checkAndReturnIndex(int[] arr , int element , int index){
        if (index>arr.length-1||index<0){
            return -1;
        }if (arr[index]==element){
            return index;
        }
        return  checkAndReturnIndex(arr, element, index+1);
    }
}
