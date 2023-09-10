package com.yash;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permuteCount("","abc"));
    }
    static void permute(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permute(f+c+s,up.substring(1));
        }
    }
    static ArrayList<String> permute1(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            l.addAll(permute1(f+c+s,up.substring(1)));
        }
        return l;
    }

    static int permuteCount(String p , String up){
        if (up.isEmpty()){
            return 1;
        }

        char c = up.charAt(0);
        int count = 0;
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permuteCount(f+c+s,up.substring(1));
        }
        return count;
    }

}
