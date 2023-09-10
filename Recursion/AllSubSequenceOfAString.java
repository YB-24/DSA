package com.yash;

import java.util.ArrayList;

public class AllSubSequenceOfAString {
    public static void main(String[] args) {
//        subset("","abc");
//        System.out.println(" hello");  //testing if blank space is printed or not
//        System.out.println(subsetArray("","abcd"));
        subsetAscii("" ,"ab");
        System.out.println(subsetArrayAscii("","ab"));
    }

    static void subset(String p , String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char c = up.charAt(0);
        subset(p+c, up.substring(1));

        subset(p, up.substring(1));
    }
    static ArrayList<String> subsetArray(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        ArrayList<String> left= subsetArray(p+c, up.substring(1));

        ArrayList<String> right= subsetArray(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    //also create subset using ascii value
    static void subsetAscii(String p , String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char c = up.charAt(0);
        subsetAscii(p+c, up.substring(1));

        subsetAscii(p+(c+0), up.substring(1));
        subsetAscii(p, up.substring(1));
    }
    static ArrayList<String> subsetArrayAscii(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        ArrayList<String> left= subsetArrayAscii(p+c, up.substring(1));
        ArrayList<String> mid= subsetArrayAscii(p+(c+0), up.substring(1));
        ArrayList<String> right= subsetArrayAscii(p, up.substring(1));

        left.addAll(right);
        left.addAll(mid);
        return left;
    }
}