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
        /*int[] arr={1,2,3,4,5,6};
        reverseArrayRecursion(arr,0);
        for (int i : arr) {
            System.out.print(i + " ");
        }*/
        //System.out.println(fibonacci(9));
        //System.out.println(sumOfDigits(123));
        //reverseNumber(1234);
        //System.out.println(sum);
        //System.out.println(reverseNumber2(1234));
        //System.out.println(palindrome(1231));
        System.out.println(returnZeros(1001100));
    }
    public static int sumOfDigits(int n){
        //base condition
        if(n<=0){
            return 0;
        }
        int remainder=n%10;
        n=n/10;
        return remainder+sumOfDigits(n);
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
        return n*factorial(n-1);

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
    public static int reverseNumber(int n){
        //base
        if(n==0){
            return 0;
        }
        int r=n%10;
        sum=sum*10+r;
        return reverseNumber(n/10);
    }
    public static int reverseNumber2(int n){
        int multiplier=(int)(Math.log10(n));
        return helperReverseNumber(n,multiplier);
    }

    public static int helperReverseNumber(int n,int multiplier){
        if(n==0){
            return 0;
        }
        int remainder=n%10;
        n=n/10;
        return (int)(remainder*Math.pow(10,multiplier) + helperReverseNumber(n,multiplier-1));
    }

    public static boolean palindrome(int n){
        int multiplier=(int)(Math.log10(n));
        return helperReverseNumber(n,multiplier)== n;
    }

    public static int returnZeros(int n){
        int z=0;
        return helperReturnZeros(n, z);

    }
    public static int helperReturnZeros(int n,int z){
        if (n == 0) {
            return z;
        }
        if(n%10==0){
            return helperReturnZeros(n/10,z+1);
        }
        return helperReturnZeros(n/10,z);
    }

}
