package fundamentals.RandomStuffs.StriverSheet.recursionBasics;

public class recursion {
    static int sum;
    static int factorial;
    public static void main(String[] args) {
        //print n to 1
        //function1(10);

        //print 1 to n
        //function2(10);

        //sum until n
       //System.out.println(sum(10));

        //factorial of n
        //System.out.println(factorial(5));
     /*   int[] arr={1,2,3,4,5,6};
        reverseArrayRecursion(arr,0);
        for (int i : arr) {
            System.out.print(i + " ");
        }*/
        System.out.println(fibonacci(9));

    }

    public static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void reverseArrayRecursion(int[] arr,int n){
            if(n==arr.length/2){
                return;
            }
            //swap functionality
            swap(arr,n);
            reverseArrayRecursion(arr,n+1);
    }
        public static void swap(int[] arr,int n){
            int length=arr.length;
            int temp=arr[n];
            arr[n]=arr[length-n-1];
            arr[length-n-1]=temp;
        }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        factorial=n*factorial(n-1);
        return factorial;
    }

    public static int sum(int n) {
    if(n==1){
        return 1;
    }
    sum=n+sum(n-1);
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
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        function1(n-1);
    }
}
