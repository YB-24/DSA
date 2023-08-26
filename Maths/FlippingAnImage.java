package com.yash;

import java.util.Arrays;

//leetcode problem No-832
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] img = {{1,1,0,0}
                       ,{1,0,0,1},
                       {0,1,1,1},
                       {1,0,1,0}};
        flipAndInvertImage(img);
        for (int[] ar:img) {
            System.out.println(Arrays.toString(ar));
        }
    }
    public static void flipAndInvertImage(int[][] image) {
        for (int[] arr:image) {
            for (int i = 0; i <=(arr.length-1)/2; i++) {
                int temp = arr[i]^1;
                arr[i]=arr[arr.length-1-i]^1;
                arr[arr.length-1-i]=temp;
            }

        }

    }
}
