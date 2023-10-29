package sortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]=new int[]{2,3,6,4,5,1,7,9,33,22};
        int[] b;
        b = bubblesort(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
    static int[] bubblesort(int arr[]){
        int length= arr.length;
        int temp;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                //swap
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        return arr;
    }

}

