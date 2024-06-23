package DSA.searchAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={10,8,9,4,6,2,5,8,1,2,0,-5};
        arr=bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
    static int[] bubbleSort(int[] arr){
        //sort in ascending order
        int length=arr.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
