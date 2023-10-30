package sortingAlgorithms;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int a[]=new int[]{2,-2,-3,3,6,4,5,1,7,0,34,9,33,33,22};
        printArray(a);
        printArray(bubblesort(a));
        printArray(selectionSort(a));

    }
    static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();
    }
    static int[] bubblesort(int arr[]){
        System.out.print("bubbleSort: ");
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
    static int[] selectionSort(int arr[]){
        //smallest to the beginning
        System.out.print("selectionSort: ");
        int length= arr.length;
        int smallest=0,temp;

        for(int i=0;i<length;i++){
            //to find the smallest element within the sub array
            smallest=i;
            for(int j=i;j<length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }

            //swap occurs when smallest and i is not same
            if(smallest!=i){
                temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
            }

        }
        //find the smallest element in the array
        return arr;
    }

}

