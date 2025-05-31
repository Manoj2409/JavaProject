package algorithms.recursion;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        Knights(board, 0, 0, 4);
    }

    static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element: row){
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void Knights(boolean[][] board,int row,int col, int knights){
        //condition for printing the board
        if(knights==0){
            display(board);
            return;
        }
        if(row==board.length-1 && col==board.length){
            return;
        }
        if(col==board.length){
            Knights(board,row+1,0,knights);
            return;
        }

        if(isSafe(board,row,col)){
            //place the queen
            board[row][col]=true;
            //find another place to place next queen
            Knights(board,row,col+1,knights-1);
            //if not satisfied backtrack
            board[row][col]=false;
        }
        Knights(board,row,col+1,knights);

    }
    static boolean isValid(boolean[][] board,int row,int col){
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //check vertical
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }
}
