package algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(countPathsForMaze(0,0));

        //print the paths - Normal
        /*List<String> printList=printPathsForMaze(0,0,"");
        printList.forEach(System.out::println);
        */
        //print the paths - Diagonal
        /*List<String> printList=printPathsForMazeDiagonal(0,0,"");
        printList.forEach(System.out::println);*/

        //print the paths - Diagonal and Restrictions
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        List<String> printList=printPathsForMazeDiagonalWithRestrictions(0,0,maze,"");
        printList.forEach(System.out::println);


    }
    static int countPathsForMaze(int r, int c){
        if(r==2||c==2){
            return 1;
        }
        int right= countPathsForMaze(r,c+1);
        int down= countPathsForMaze(r+1,c);
        return down+right;
    }
    static List<String> printPathsForMaze(int r, int c,String s){
        List<String> right=new ArrayList<>();
        List<String> down=new ArrayList<>();
        //base condition
        if(r==2 && c==2){
            List<String> stringList=new ArrayList<>();
            stringList.add(s);
            return stringList;
        }
        //conditional branch condition
        if(c<2){
            right= printPathsForMaze(r,c+1,s+"R");
        }
        if (r<2) {
            down= printPathsForMaze(r+1,c,s+"D");
        }

        right.addAll(down);
        return right;
    }

    static List<String> printPathsForMazeDiagonal(int r, int c,String s){
        List<String> right=new ArrayList<>();
        List<String> down=new ArrayList<>();
        List<String> diagonal=new ArrayList<>();
        //base condition
        if(r==2 && c==2){
            List<String> stringList=new ArrayList<>();
            stringList.add(s);
            return stringList;
        }
        //conditional branch condition
        if (r < 2 && c < 2) {
            diagonal=printPathsForMazeDiagonal(r+1,c+1,s+"D");
        }
        if(c<2){
            right= printPathsForMazeDiagonal(r,c+1,s+"H");
        }
        if (r<2) {
            down= printPathsForMazeDiagonal(r+1,c,s+"V");
        }
        right.addAll(diagonal);
        right.addAll(down);
        return right;
    }

    static List<String> printPathsForMazeDiagonalWithRestrictions(int r, int c,boolean[][] maze,String s){
        List<String> right=new ArrayList<>();
        List<String> diagonal=new ArrayList<>();
        List<String> down=new ArrayList<>();
        //base condition
        if(r==2 && c==2){
            List<String> stringList=new ArrayList<>();
            stringList.add(s);
            return stringList;
        }
        //conditional branch condition
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        if (r < 2 && c < 2) {
            diagonal=printPathsForMazeDiagonalWithRestrictions(r+1,c+1,maze,s+"D");
        }
        if(c<2){
            right= printPathsForMazeDiagonalWithRestrictions(r,c+1,maze,s+"H");
        }
        if (r<2) {
            down= printPathsForMazeDiagonalWithRestrictions(r+1,c,maze,s+"V");
        }
        right.addAll(diagonal);
        right.addAll(down);
        return right;
    }

}
