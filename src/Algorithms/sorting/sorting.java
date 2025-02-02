package Algorithms.sorting;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int arr[]={10,8,9,4,6,2,5,8,1,2,0,-5};
        int result[]={-5,0,1,2,2,4,5,6,8,8,9,10};
        printTheArray(result);
        //printTheArray(bubbleSort(arr));
        //printTheArray(selectionSort(arr));
        //printTheArray(insertionSort(arr));
        //printTheArray((mergeSort(arr)));
        printTheArray(quickSort(arr));

    }
    public static void printTheArray(int[] arr){
        System.out.println(Arrays.toString(arr));
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
                //get the index of minimum value within the sub array
                if(arr[minElementIndex]>arr[j]){
                    minElementIndex=j;
                }
            }
            //if it finds, then swap
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
        int left[]=mergeSort(Arrays.copyOfRange(array,0,mid));//first returns left part of sorted array and proceeds further
        int right[]=mergeSort(Arrays.copyOfRange(array,mid,array.length));

        return merge(left,right);
    }
        //quick sort
        private static int pivot(int[] array, int pivotIndex, int endIndex) {
        //place that value in the respective index
            int swapIndex = pivotIndex;
            for (int i = pivotIndex + 1; i <= endIndex; i++) {
                if (array[i] < array[pivotIndex]) {
                    swapIndex++;
                    swap(array, swapIndex, i);
                }
            }
            swap(array, pivotIndex, swapIndex);
            return swapIndex;
        }

    private static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex-1);
            quickSortHelper(array, pivotIndex+1, right);
        }
    }
    public static int[] quickSort(int[] arr){
        quickSortHelper(arr,0, arr.length-1);
        return arr;
    }

//bubble sort       : pure brute force
//selection sort    : select the minimum value from the list and then sort which reduces the number of swaps and more optimal than bubble sort
//insertion sort    : optimal when the array is partially sorted
//merge sort        : one of the optimal approach TC: O(n log n) and using recursive strategy
//quick sort        : used for most unsorted array and not optimal for partially or fully sorted array

}
