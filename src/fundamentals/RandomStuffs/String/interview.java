package fundamentals.RandomStuffs.String;

/*
Given an array arr of positive integers. Reverse every sub-array group of size k.
Note: If at any instance, k is greater or equal to the array size, then reverse the entire array.
Examples:
Input: k = 3, arr= [1, 2, 3, 4, 5] Output: [2,1,3,4,5]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.
Input: k = 5, arr = [5, 6, 8, 9] Output: [9, 8, 6, 5]
Explanation: Since k is greater than array size, the entire array is reversed.
* */
public class interview {
    public static void main(int[] args) {
        Integer arr[]={1, 2, 3, 4, 5};
        Integer k=3;
        reverseTheSubArray(arr,k);

    }
    public static void reverseTheSubArray(Integer[] arr,Integer k){
        Integer length= arr.length;
        if(k>= arr.length){
            for(int i=0;i< arr.length/2;i++){
                //swap(arr[i],arr[arr.length-1-i]);
                Integer temp=arr[i];
                arr[i]=arr[length-i-1];
                arr[length-i-1]=temp;
            }
        }
        else if(k<length){
            for(int i=0;i< k/2;i++){
                //swap(arr[i],arr[arr.length-1-i]);
                Integer temp=arr[i];
                arr[i]=arr[k-i-1];
                arr[k-i-1]=temp;
            }
        }
        for(Integer numbers:arr){
            System.out.print(numbers+" ");
        }
    }
    public static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=a;
    }

    //condition : if (k>=array length) reverse the entirely
}
