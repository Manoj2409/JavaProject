package Algorithms.recursion;

public class recurion1 {
    static int sum=0;
    //static int counter=0;
    public static void main(String[] args) {
        //print factorial using recursion
//        System.out.println(factorial(4));
        int print=0;
        String printS;
        //print= sumOfDigits(1344);
        //print=productOfDigits(1234);
        int n=10101;
        //print=reverseNumber(n,(int)(Math.log10(n)+1));
        //printS=palindromeNumber(n);
        //print=count(n);
        print=helperstepsCount(14);
        System.out.println(print);
    }
    static int count(int n){
       return CountZeros(n,0);
    }
    static int CountZeros(int n,int counter){
        if(n==0){
            return counter;
        }
        if(n%10==0)counter++;
        return CountZeros(n/10,counter);
    }
    static String palindromeNumber(int n){
        int revNo=reverseNumber(n,(int)Math.log10(n)+1);
        //System.out.println(revNo);
        String op= n==revNo?"Paindrome":"Not a palindrome";
        return op;
    }
    static int reverseNumber(int n,int digits){
        if(n%10==n){
            return n;
        }

        int rem=n%10;
        return
                rem * (int) Math.pow(10,digits-1)
                + reverseNumber(n/10,digits-1);
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int helperstepsCount(int n){
        
        return stepsCount(n,0);
    }
   // static int steps=0;
    static int stepsCount(int n,int steps){
        if(n==0){
            return steps;
        }
        if (n % 2 == 0) {
            return stepsCount(n/2,steps+1);
        }
        else {
            return stepsCount(n-1,steps+1);
        }

    }
    static int sumOfNumber(int n){
        if(n==1){
            return 1;
        }
        return n+factorial(n-1);
    }
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+ sumOfDigits(n/10);
    }
    static int productOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return n%10 * productOfDigits(n/10);
    }

}
