package com.yash;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
       char[] letters = {'c','f','j'};
               char target = 'j';
        System.out.println(nextGreatestLetter2(letters,target));
    }
        public char nextGreatestLetter(char[] letters, char target) {
            int start=0;
            int end=letters.length-1;
            if(convert(letters[end])<=convert(target)){
                return letters[0];
            }
            while(start<=end){
                int mid= start + (end-start)/2;
                if(letters[mid]==target){
                    while(letters[mid]==target){
                        mid++;
                    }
                    return letters[mid];
                }
                if(convert(letters[mid])>convert(target)){
                    end=mid-1;
                }
                if(convert(letters[mid])<convert(target)){
                    start=mid+1;
                }
            }
            return letters[start];
        }
        static int convert(char c){
            int a=(int)c;
            return a;
        }

        public static char nextGreatestLetter2(char[] letters, char target){
            int start = 0;
            int end = letters.length-1;
            while (start<=end){
                int mid = start+(end-start)/2;
                if (letters[mid]>target){
                    end=mid-1;
                }
                if(letters[mid]<=target){
                    start=mid+1;
                }
            }
            return letters[start%letters.length];
        }

}
