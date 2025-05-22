package algorithms.recursion;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        //allPaths(0,0,maze,"");

        boolean[][] maze1={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][] matrix={
                {0,0,0},
                {0,0,0},
                {0,0,0},
        };
        allPathsWithPrinting(0,0,maze1,"",matrix,0);
    }
    static void allPaths(int r,int c,boolean[][] maze,String string){
        if(r==2 && c==2){
            System.out.println(string);
            return;
        }
        //add 4 conditions
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        //right
        if(c<maze[0].length-1){
            allPaths(r,c+1,maze,string+"R");
        }
        //left
        if(c>0){
            allPaths(r,c-1,maze,string+"L");
        }
        //up
        if(r>0){
            allPaths(r-1,c,maze,string+"U");
        }
        //down
        if(r<maze.length-1){
            allPaths(r+1,c,maze,string+"D");
        }
        maze[r][c]=true;
    }

    static void allPathsWithPrinting(int r,int c,boolean[][] maze,String string,int[][] matrix,int step){
        if(r==2 && c==2){
            System.out.println(string);
            matrix[r][c]=step+1;
            for (int[] i : matrix) {
                for (int j : i) {
                    System.out.print(j);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        //add 4 conditions
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        step++;
        matrix[r][c]=step;
        //right
        if(c<maze[0].length-1){
            allPathsWithPrinting(r,c+1,maze,string+"R",matrix,step);
        }
        //left
        if(c>0){
            allPathsWithPrinting(r,c-1,maze,string+"L",matrix,step);
        }
        //up
        if(r>0){
            allPathsWithPrinting(r-1,c,maze,string+"U",matrix,step);
        }
        //down
        if(r<maze.length-1){
            allPathsWithPrinting(r+1,c,maze,string+"D",matrix,step);
        }
        maze[r][c]=true;
        step--;
        matrix[r][c]=0;

    }
}
