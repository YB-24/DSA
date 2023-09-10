package com.yash;

public class SkipACharacterInString {
    public static void main(String[] args) {
        System.out.println(skip("baabndhd",0));
        skip("bachdsiajffja","");
    }
    static String skip(String s,int index){
       if (index==s.length()){
           return " ";
       }
        if (s.charAt(index)=='a'){
            return skip(s,index+1);
        }else {
            return s.charAt(index)+skip(s, index+1);
        }
    }

    //another approach
    static void skip(String up, String p){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if ('a'==ch){
            skip(up.substring(1),p);
        }else {
            skip(up.substring(1),p+ch);
        }
    }
}