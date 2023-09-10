package com.yash;

public class SkipAStringInString {
    public static void main(String[] args) {
        skip2("bachdsiappleappllishpleappjffja","");
    }

    //skips apple in string
    static void skip(String up, String p){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")){
            skip(up.substring(5),p);
        }else {
            skip(up.substring(1),p+ch);
        }
    }

    //skip app when it's not equal to apple
    static void skip2(String up, String p){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (up.startsWith("app")){
            if (up.startsWith("apple")) {
                skip2(up.substring(5), p + "apple");
            }else {
                skip2(up.substring(3),p);
            }
        }else {
            skip2(up.substring(1),p+ch);
        }
    }
}