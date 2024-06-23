package DSA.patterns;

public class patterns {
    public static void main(String[] args) {
        //pattern1(5);
        pattern1Recursion(0,0,5);
        
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1Recursion(int row,int col,int n){
        if(col<n){
            System.out.print("* ");
            pattern1Recursion(row,col+1,n);
        } else if (col==n && row+1 < n) {
            System.out.println();
            pattern1Recursion(row+1,0,n);
        }else{
            return;
        }
        
    }
    
}
