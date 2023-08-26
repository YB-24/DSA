package com.yash;
//leetcode problem no-137
public class SingleNumberII {
    public static void main(String[] args) {
  int[] array={3,3,3,2};
        System.out.println(single(array));
    }
    public static int single(int[] arr){
        int[] array=new int[32];
            for (int n:arr) {
                int counter=0;
                for (int i = 0;i<32;i++){
                  array[counter]=array[counter]%3+(n&1);
                  n=n>>1;
                  if (n==0){
                      break;
                  }
                    counter++;
            }

        }
            int ans=0;
            int base=1;
            for (int i=0;i<array.length;i++){
                if (array[i]==1) {
                    ans = ans + base;
                }
                    base = base * 2;
            }
            return ans;
    }
}
