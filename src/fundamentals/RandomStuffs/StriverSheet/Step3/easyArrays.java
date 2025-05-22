package fundamentals.RandomStuffs.StriverSheet.Step3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class easyArrays {

    static public void LargestElementInArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>largest){
                largest=i;
            }
        }
        System.out.println("Largest Element in array : "+largest);
    }
    static public void SecondLargestElement(int arr[]){
        int largest1=Integer.MIN_VALUE,largest2=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>=largest1){
                largest2=largest1;
                largest1=i;
            }else if(largest2<i){
                largest2=i;
            }

        }
        System.out.println(largest1);
        System.out.println(largest2);
    }
    static public Boolean rotatedArray(int arr[]){
        int size= arr.length, smallestElement=Integer.MAX_VALUE,smallestElementIndex=Integer.MIN_VALUE;
        //scan for the lowest element and return its index
        for(int i=0;i< size;i++){
            if(smallestElement>arr[i]){
                smallestElement=arr[i];
                smallestElementIndex=i;
            }
        }

        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int i,j,difference,counter=0; counter<=size-2; counter++,smallestElementIndex++){
            //second index position
            i=smallestElementIndex % size;
            j=(smallestElementIndex+1)%size;
            difference=arr[j]-arr[i];
            treeSet.add(difference);
        }
        if(treeSet.contains(0)){
            return treeSet.size() == 2;
        }else{
            return treeSet.size() == 1;
        }
    }
    public static void rotateArray(int nums[],int k){

        int[] array1=Arrays.copyOfRange(nums,nums.length-k,nums.length);
        int[] array2=Arrays.copyOfRange(nums,0,nums.length-k);
        int[] mergedArray =new int[nums.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        for(int i:mergedArray){
            System.out.print(i+",");
        }

    }

    public static void main(String[] args) {
        //int[] arr={10,9,-1,2,1,4,7,9,3,6,6,89,4,99};
        //LargestElementInArray(arr);
        //SecondLargestElement(arr);
        /*int arr[]={2,3,4,1,2};
        Boolean something=rotatedArray(arr);
        System.out.println(something);*/
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotateArray(nums,k);
    }
}
