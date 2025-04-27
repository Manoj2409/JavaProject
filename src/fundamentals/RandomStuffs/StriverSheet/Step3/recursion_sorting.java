package fundamentals.RandomStuffs.StriverSheet.Step3;

public class recursion_sorting {
    //the idea is that you need to convert two for loops printing statement to one loop + recursion

    public static void bubbleSort(int[] arr, int n){
        int temp;
        //base condition
        if(n== 1){
            return;
        }
        //bubbling up the largest element to the right
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        //System.out.print(arr[j]);

        bubbleSort(arr,n-1);
    }
public static void printArray(int arr[]){
    for(Integer i:arr){
        System.out.printf(i+" ");
    }
}
    public static void insertionSort(int[] arr,int i,int n){
        //base condition
        if(i==n){
            return;
        }
        int temp=arr[i];
        int j=i-1;

        //shift the elements to the right
        for(;j>=0 && arr[j]>temp;j--){
            //swap(arr,j,j+1);
            arr[j+1]=arr[j];
        }

        //insert the arr i in correct place
        arr[j+1]=temp;
        insertionSort(arr,i+1,n);
        //return arr;
    }

    public static void main(String[] args) {
            int[] arr={5,1,4,3,2};
            //bubbleSort(arr, arr.length);
            insertionSort(arr,0,arr.length);
            printArray(arr);

    }
}
