package com.yash;

import java.util.ArrayList;
import java.util.List;

public class PhoneKeyPadModified {
    public static void main(String[] args) {
       // keyPad("","12");
        System.out.println(keyPadList("","22"));
    }
    static  ArrayList<String> keyPadList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String>  l = new ArrayList<>();
            l.add(p);
            return l;
        }
        int n = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        if (n>=2 && n<=6){
            n--;
        for (int i = (n-1)*3; i < 3*n; i++) {
            char c = (char) ('a'+i);
           list.addAll(keyPadList(p+c,up.substring(1)));
        }
        }else if (n==7){
            for (int i = 15; i < 19; i++) {
                char c = (char) ('a'+i);
                list.addAll(keyPadList(p+c,up.substring(1)));
            }
        }else if (n==8){
            for (int i = 19; i < 22; i++) {
                char c = (char) ('a'+i);
                list.addAll(keyPadList(p+c,up.substring(1)));
            }
        }else if (n==9){
            for (int i = 22; i <= 25; i++) {
                char c = (char) ('a'+i);
                list.addAll(keyPadList(p+c,up.substring(1)));
            }
        }
        return list;
    }
}
