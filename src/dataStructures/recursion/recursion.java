package dataStructures.recursion;

public class recursion {
    public static void main(String[] args) {
  /*  //print 1-10
    printNumbers(10);
    //print the nth fibonacci number
    System.out.println(Fibonacci(10));*/
       /* int arr[]={1,2,3,4,5,6,7,8,9,10};
        int tar=6;
        int s=0,e=arr.length-1;
        for(int i=0;i<12;i++){
            System.out.println(BinarySearch(arr, i,s,e));
        }*/
       // System.out.println(BinarySearch(arr, tar,s,e));

        printNumbers2(10);
    }
    static void printNumbers2(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printNumbers2(n-1);
    }

    static int BinarySearch(int[] arr, int tar, int s, int e) {
        //find middle number
        int mid=(s+e)/2;

       if(tar > arr[e] || tar < arr[s]){
           return -1;
       }

        if(arr[s]== tar){
            return s;
        } else if(arr[e]== tar){
            return e;
        } else if (arr[mid]== tar) {
            return mid;
        }

        if(tar>arr[mid]){
            s=mid+1;
            return BinarySearch(arr, tar, s, e);
        }else if(tar < arr[mid]){
            e=mid-1;
            return BinarySearch(arr, tar, s, e);
        }
        return -1;
    }

    static int Fibonacci(int i) {
        if(i<2){
            return i;
        }
        return Fibonacci(i-1)+Fibonacci(i-2);
    }

    static void printNumbers(int n) {
        //base condition
        if (n < 1) {
             return;
         }
         printNumbers(n-1);
         System.out.println(n);
     }


}
