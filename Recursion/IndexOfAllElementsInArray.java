package com.yash;

import java.util.ArrayList;

public class IndexOfAllElementsInArray {
    public static void main(String[] args) {
        int[] array = {25,21,4,4,5,9,15};
        System.out.println(element(array,4));
        System.out.println(allIndex(array,0,4));
    }

    public static ArrayList<Integer> element(int[] array, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        return helper(array, 0, target, list);
    }

    static ArrayList<Integer> helper(int[] array, int i, int target, ArrayList<Integer> list) {
        if (i == array.length) {
            return list;
        }
        if (array[i] == target) {
            list.add(i);
        }
            return helper(array, i + 1, target, list);
    }

    //not very optimised solution
    static ArrayList<Integer> allIndex(int[] array, int i, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == array.length) {
            return list;
        }
        if (array[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> n= allIndex(array, i + 1, target);

        list.addAll(n);
        return list;
    }
}