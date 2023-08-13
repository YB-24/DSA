package com.yash;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = " Yash Bagul";
//        char[] ar = name.toCharArray();   //converts string to character array
//        System.out.println(Arrays.toString(ar));  //print elements of array in neat format
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(linearSearchInString("Yash",'s'));

        System.out.println(linearSearchInString2( name , 'u'));
    }
    public static boolean linearSearchInString(String str,char ch){
        if (str.length()==0){
            return false;
        }
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
    public static boolean linearSearchInString2(String str,char ch){
        if (str.length()==0){
            return false;
        }
       for (char c: str.toCharArray()){
           if (c==ch){
               return true;
           }
       }
        return false;
    }
}
