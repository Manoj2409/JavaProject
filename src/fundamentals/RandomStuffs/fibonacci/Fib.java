package fundamentals.RandomStuffs.fibonacci;

public class Fib {
    //using recursion
    public int fibonacciUsingRecursion(int n){
        if(n<=1)return n;//base case
        return fibonacciUsingRecursion(n-1)+fibonacciUsingRecursion(n-2);
    }
    //memoization
    public int fibonacciUsingDPMemozation(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciUsingDPMemozation(n - 1, memo)
                    + fibonacciUsingDPMemozation(n - 2, memo);
        return memo[n];
    }
    //using dp
    public int fibonacciUsingDPTabulation(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
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
    //java 8 Streams
    public int fibonacciUsingJavaAPI(int n) {
        return java.util.stream.Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(n + 1)
                .map(arr -> arr[0])
                .reduce((first, second) -> second)
                .orElse(0);
    }

    public static void main(String[] args) {
        //finding fibonacci number in different ways
        int n=20;
        Fib fib=new Fib();
        //using recursion
        System.out.println("Using only recursion : "+fib.fibonacciUsingRecursion(n));
        //using iteration
        System.out.println("Using iteration : "+fib.fibonacciIterationMethod(n));
        //using memozation
        System.out.println("Using memoizaiton : "+fib.fibonacciUsingDPMemozation(n,new int[n+1]));
        //using dp
        System.out.println("Using dp : "+fib.fibonacciUsingDPTabulation(n));
        //using java api
        System.out.println("Using Java8 API : "+fib.fibonacciUsingJavaAPI(n));


    }
}
