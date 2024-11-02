package Algorithms.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int print=0;
        print=fibo(6);
        System.out.println(print);
    }
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
