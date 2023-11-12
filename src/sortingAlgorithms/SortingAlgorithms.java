package sortingAlgorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int a[]=new int[]{2,-2,-3,3,6,4,5,1,7,0,34,9,33,33,22};

        printArray(a);
        //bubblesort(a);
        //selectionSort(a);
        insertionSort(a);
    }
    static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();
    }
    static void bubblesort(int arr[]){
       // System.out.print("bubbleSort: ");
        int length= arr.length;
        int temp,swapCounter=0;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                //swap
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swapCounter++;
                }
            }
        }
        System.out.println("Swap count : "+swapCounter);

    }
    static void selectionSort(int arr[]){
        //smallest to the beginning
       // System.out.print("selectionSort: ");
        int length= arr.length;
        int smallest=0,temp,swapCounter = 0;

        for(int i=0;i<length-1;i++){
            //to find the smallest element within the sub array
            smallest=i;
            for(int j=i+1;j<length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swap occurs when smallest and i is not same
            if(smallest!=i){
                temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
                swapCounter++;
            }

        }
        System.out.println("Swap count : "+swapCounter);
        //find the smallest element in the array
        printArray(arr);
    }

    static void insertionSort(int arr[]){
        int length=arr.length;
        for (int i = 0; i <length-1; i++) {
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
        }
        printArray(arr);
    }

}
/*
The difference between bubble sort and selection sort is that
Bubble sort : Swapping occurs whenever it finds a number that is satisfying the above condition
Selection sort : it swaps only the required number(that too its equal or less that the length of the array)
 */