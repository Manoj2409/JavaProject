package fundamentals.RandomStuffs.fibonacci;

public class Fib {
    //using recursion
    public int fibonacciUsingRecursion(int n){
        if(n<=1)return n;//base case
        return fibonacciUsingRecursion(n-1)+fibonacciUsingRecursion(n-2);
    }

    //using iteration
    public int fibonacciIterationMethod(int n){
    if(n<=1) return n;
    int n1=0,n2=1,n3=0;
    for(int i=0;i<=n-2;i++){
        n3=n2+n1;
        n1=n2;
        n2=n3;
    }
    return n3;
    }

    public static void main(String[] args) {
        //finding fibonacci number in different ways
        int n=20;
        Fib fib=new Fib();
        //using recursion
        System.out.println(fib.fibonacciUsingRecursion(n));
        //using iteration
        System.out.println(fib.fibonacciIterationMethod(n));
    }
}
