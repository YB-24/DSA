package com.yash;

import java.util.ArrayList;

public class MazeProblems {
    public static void main(String[] args) {
//        System.out.println(maze(3,4));
//        mazePath(3,4,"");
//        System.out.println(mazePathList(3,4,""));
       // mazePathD(3,3,"");
      boolean[][] maze={{true,true,true},
                        {true,false,true},
                        {true,true,true}};

      mazeObstacles(0,0,"",maze);

    }
    static int maze(int r,int c){
        if (r==1||c==1){
            return 1;
        }
        int left=maze(r-1,c);
        int right=maze(r,c-1);
        return left+right;
    }
    static void mazePath(int r, int c,String p){
        if (r==1&&c==1){
            System.out.println(p);
            return;
        }
        if (r>1) {
            mazePath(r - 1, c, p + "D");
        }
        if (c>1) {
            mazePath(r, c - 1, p + "R");
        }

    }
    static ArrayList<String> mazePathList(int r, int c, String p){
        if (r==1&&c==1){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r>1) {
           list.addAll(mazePathList(r - 1, c, p + "D"));
        }
        if (c>1) {
           list.addAll( mazePathList(r, c - 1, p + "R"));
        }
        return list;
    }
    //if we consider diagonal move also
    static void mazePathD(int r, int c,String p){
        if (r==1&&c==1){
            System.out.println(p);
            return;
        }
        if (r>1) {
            mazePathD(r - 1, c, p + "D");
        }
        if (r>1 && c>1){
            mazePathD(r-1,c-1,p+"C");
        }
        if (c>1) {
            mazePathD(r, c - 1, p + "R");
        }

    }

    //if we consider obstacles in maze
    static void mazeObstacles(int r,int c, String p, boolean[][] b){
        if (r == b.length-1 && c == b[0].length-1){
            System.out.println(p);
            return;
        }
        if (!b[r][c]){
            return;
        }
        if (r<b.length-1){
            mazeObstacles(r+1,c,p+"R",b);
        }
        if (c<b[0].length-1){
            mazeObstacles(r,c+1,p+"D",b);
        }
    }
}