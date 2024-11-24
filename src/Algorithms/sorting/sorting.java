package Algorithms.sorting;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int arr[]={10,8,9,4,6,2,5,8,1,2,0,-5};
        int result[]={-5,0,1,2,2,4,5,6,8,8,9,10};
        //printTheArray(bubbleSort(arr));
        //printTheArray(selectionSort(arr));
        //printTheArray(insertionSort(arr));
        printTheArray(result);
        System.out.println();
        printTheArray((mergeSort(arr)));

    }
    public static void printTheArray(int[] arr){
        for(int number : arr){
            System.out.print(number+",");
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] bubbleSort(int[] arr){
        //sort in ascending order
        int length=arr.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]>arr[j]){
                        swap(arr,i,j);
                }
            }
        }
        return arr;
    }
    static int[] selectionSort(int[] arr){
        int minElementIndex;
        for(int i=0;i< arr.length-1;i++){
            minElementIndex=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[minElementIndex]>arr[j]){
                    minElementIndex=j;
                }
            }
            if(minElementIndex!=i){
                swap(arr,minElementIndex,i);
            }
        }
        return arr;
    }
    static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            for(;j>=1 && arr[j]<arr[j-1];j--){
                swap(arr,j,j-1);
            }
        }
        return arr;
    }
    static int[] merge(int arr1[],int array2[]){
        int combined[]=new int[arr1.length+array2.length];
        int index=0,i=0,j=0;
        for(;i<arr1.length && j<array2.length;){
            if(arr1[i]<array2[j]){
                combined[index]=arr1[i];
                index++;
                i++;
            }
            else{
                combined[index]=array2[j];
                index++;
                j++;
            }
        }
        //it will pick any left off values that's missed from any one array after combining
        while (i<arr1.length){
            combined[index]=arr1[i];
            i++;
            index++;
        }
        while(j<array2.length){
            combined[index]=array2[j];
            j++;
            index++;
        }
        return combined;
    }
    static int[] mergeSort(int array[]){
        //base condition
        if(array.length==1)return array;

        int mid=array.length/2;
        int left[]=mergeSort(Arrays.copyOfRange(array,0,mid));
        int right[]=mergeSort(Arrays.copyOfRange(array,mid,array.length));

        return merge(left,right);
    }





//bubble sort       : pure brute force
//selection sort    : select the minimum value from the list and then sort which reduces the number of swaps and more optimal than bubble sort
//insertion sort    : optimal when the array is partially sorted
//merge sort        : one of the optimal approach TC: O(n log n) and using recursive strategy

}
