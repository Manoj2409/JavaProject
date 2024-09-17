package dataStructures.StriverSheet.recursionBasics;

public class recursion {
    static int sum;
    static int factorial;
    public static void main(String[] args) {
        //print n to 1
        function1(10);

        //print 1 to n
        //function2(10);

        //sum until n
        System.out.println(sum(10));

        //factorial of n
        //System.out.println(factorial(5));


    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        factorial=n*factorial(--n);
        return factorial;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        sum= (int) (Math.pow(n,3))+sum(--n);
        return sum;
    }
    public static void function2(int n){
        if(n<1){
            return;
        }
        function2(n-1);
        System.out.print(n+" ");
    }

    public static void function1(int n){
        System.out.print(n+" ");
        n=n-1;
        if(n<=0){
            return;
        }
        function1(n);
    }
}
