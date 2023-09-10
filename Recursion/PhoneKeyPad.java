package com.yash;

import java.util.ArrayList;

public class PhoneKeyPad {
    public static void main(String[] args) {
        keyPad("","12");
        System.out.println(keyPadList("","12"));
    }

    static void keyPad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int n = up.charAt(0)-'0';

        for (int i = (n-1)*3; i < 3*n; i++) {
            char c = (char) ('a'+i);
            keyPad(p+c,up.substring(1));
        }
    }
    static  ArrayList<String> keyPadList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String>  l = new ArrayList<>();
            l.add(p);
            return l;
        }
        int n = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (n-1)*3; i < 3*n; i++) {
            char c = (char) ('a'+i);
           list.addAll(keyPadList(p+c,up.substring(1)));
        }
        return list;
    }
}
