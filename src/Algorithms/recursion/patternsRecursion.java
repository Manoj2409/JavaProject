package Algorithms.recursion;

public class patternsRecursion {
    public static void main(String[] args) {
        triangle2(4,0);
    }
    public static void triangle2(int r,int c){
        if(r<=c){
            triangle(r,c+1);
            System.out.print("*");
        }else {
            triangle(r-1,0);
            System.out.println();
        }
    }
    public static void triangle(int r,int c){
        if(r>c){
            System.out.print("*");
            triangle(r,c+1);
        }else if(r==c){
            System.out.println();
            triangle(r-1,0);
        }
    }

    /*
    ****
    ***
    **
    *
     */
}
