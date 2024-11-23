package Algorithms.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={10,8,9,4,6,2,5,8,1,2,0,-5};
        arr=bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
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
}
