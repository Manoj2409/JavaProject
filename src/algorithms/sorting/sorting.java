package algorithms.sorting;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        //int arr[]={10,8,9,4,6,2,5,8,1,2,0,-5};
        //int result[]={-5,0,1,2,2,4,5,6,8,8,9,10};
        int arr[]={2,3,1};
        System.out.print("Original array : ");printTheArray(arr);
        //System.out.print("Expected result : ");printTheArray(result);
        System.out.print("Actual result : ");
        //printTheArray(bubbleSort(arr));
        //printTheArray(selectionSort(arr));
        printTheArray(insertionSort(arr));
        //printTheArray((mergeSort(arr)));
       // printTheArray(quickSort(arr));

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
            int temp=arr[i];
            int j=i-1;

            //shift the elements to the right
            for(;j>=0 && arr[j]>temp;j--){
                //swap(arr,j,j+1);
                arr[j+1]=arr[j];
            }

            //insert the arr i in correct place
            arr[j+1]=temp;
        }
        return arr;
    }
    static int[] merge(int arr1[],int arr2[]){
        int[] combined =new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        for(;i<arr1.length && j<arr2.length;k++){
            if(arr1[i]<arr2[j]){
                combined[k]=arr1[i];
                i++;
            }else{
                combined[k]=arr2[j];
                j++;
            }
        }
        //manage left out elements
        while(i<arr1.length){
            combined[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            combined[k]=arr2[j];
            j++;
            k++;
        }
        return combined;
    }

    static int[] mergeSort(int[] arr){
        //base condition
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left =mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right =mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

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
