package com.yash;

import java.util.Arrays;

public class AllPathsInMaze {
    public static void main(String[] args) {
        boolean[][] maze={{true,true,true},
                         {true,true,true},
                         {true,true,true}};
      //  mazeAllPaths(0,0,"", maze);
        int[][] pat = new int[maze.length][maze[0].length];
        mazeAllPaths(0,0,"", maze,pat,1);
    }
    static void mazeAllPaths(int r, int c, String p, boolean[][] b){
        if (r == b.length-1 && c == b[0].length-1){
            System.out.println(p);
            return;
        }
        if (!b[r][c]){
            return;
        }
        b[r][c]=false;
        if (r<b.length-1){
            mazeAllPaths(r+1,c,p+"R",b);
        }
        if (c<b[0].length-1){
            mazeAllPaths(r,c+1,p+"D",b);
        }
        if (r>0){
            mazeAllPaths(r-1,c,p+"U",b);
        }
        if (c>0){
            mazeAllPaths(r,c-1,p+"L",b);
        }
        b[r][c]=true;
    }

    //if we want to show path also
    static void mazeAllPaths(int r, int c, String p, boolean[][] b,int[][] path,int count){
        if (r == b.length-1 && c == b[0].length-1){
            path[r][c]=count;
        for (int[] arr:path){
            System.out.println(Arrays.toString(arr));

        }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!b[r][c]){
            return;
        }
        b[r][c]=false;
        path[r][c]=count;
        if (r<b.length-1){
            mazeAllPaths(r+1,c,p+"R",b,path,count+1);
        }
        if (c<b[0].length-1){
            mazeAllPaths(r,c+1,p+"D",b,path,count+1);
        }
        if (r>0){
            mazeAllPaths(r-1,c,p+"U",b,path,count+1);
        }
        if (c>0){
            mazeAllPaths(r,c-1,p+"L",b,path,count+1);
        }
        b[r][c]=true;
        path[r][c]=0;
    }
}
