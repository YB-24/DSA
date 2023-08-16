package com.yash;
//leetcode problem no 410
public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end=0;
        //potential answers
        for (int i=0;i<=nums.length-1;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        if(k==1){
            return end;
        }
        if(k==nums.length){
            return start;
        }
        while (start<end){
            int mid = start+(end-start)/2;
            int ans=0;
            int pieces=1;
            for (int j:nums){

                if (ans+j>mid){
                    ans=j;
                    pieces++;
                }else{
                    ans+=j;
                }
            }
            if (pieces>k){
                start=mid+1;
            }else {
                end=mid;
            }
        }
        return end;
    }
}
