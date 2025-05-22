package algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(countPathsForMaze(0,0));
        //print the paths
        List<String> printList=printPathsForMaze(0,0,"");
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
}
