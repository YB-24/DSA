package com.yash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
      //  List<List<Integer>> ans = sub(new int[]{3,5,8,9});
        List<List<Integer>> ans = subDuplicate(new int[]{1,2,2});
        for (List<Integer> l:ans ) {
            System.out.println(l);
        }
    }
    static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num:arr ) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        }

    return outer;

    }
    static List<List<Integer>> subDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for (int j=0;j<arr.length;j++ ) {
            int n = outer.size();
           start=0;

            if (j>0 && arr[j]==arr[j-1]){
                start=end+1;
            }
            end=outer.size()-1;


            for (int i = start; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }

        }

    return outer;

    }
}
