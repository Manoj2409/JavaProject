package fundamentals.Collections.LeetCodeSetUp;

public class lc123 {
    public static void main(String[] args) {
        int n=30;
        int out=function1(n);
        System.out.println(out);
    }
    public static int function1(int n){
        return fibo(n);
    }
    public static int fibo(int n){
        //base condition
        if(n==1){
            return 1;
        } else if (n==0) {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
