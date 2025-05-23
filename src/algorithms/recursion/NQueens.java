package algorithms.recursion;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] booleans=new boolean[n][n];
        System.out.println(Queens(booleans,0));
    }
    static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element: row){
                if(element){
                System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static int Queens(boolean[][] board,int row){
        //condition for printing the board
        if(row==board.length){
            display(board);
            return 1;
        }

        int count=0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
            //place the queen
            board[row][col]=true;
            //find another place to place next queen
            count=count+Queens(board,row+1);
            //if not satisfied backtrack
            board[row][col]=false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board,int row,int col){
        //check vertical
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //check the top left
        int maxTopLeft=Math.min(row,col);

        for (int i = 1; i <=maxTopLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        //check the top right
        int maxTopRight=Math.min(row, board.length-col-1);
        for (int i = 1; i <=maxTopRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    }
