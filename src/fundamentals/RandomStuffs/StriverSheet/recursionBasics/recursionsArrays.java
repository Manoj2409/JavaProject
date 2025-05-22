package fundamentals.RandomStuffs.StriverSheet.recursionBasics;

public class recursionsArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        // System.out.println(sortedArray(arr,0));
        Boolean result= BinarySearch(arr,4);
        System.out.println(result);
    }

    public static boolean sortedArray(int[] arr, int index){
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sortedArray(arr,index+1);
    }

    public static boolean BinarySearch(int[] arr, int value){
        return helperBinarySearch(arr,value,0,arr.length-1);
    }

    public static boolean helperBinarySearch(int[] arr, int value, int start, int end){
        if(start>end){
            return false;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==value){
            return true;
        }
        else if(arr[mid]<value){
            return helperBinarySearch(arr,value,mid+1,end);
        } else if (arr[mid]>value) {
            return helperBinarySearch(arr,value,start,mid-1);
        }
        return true;
    }

    public static boolean rotatedSortedArray(int[] arr,int start,int end ,int value){
        int mid = start + (end-start)/2;
        if(start>end){
            return false;
        }
        if(arr[mid]==value){
            return true;
        }
        //four conditions
        if(arr[mid]> arr[start]){
            if((value < arr[mid] && value >= arr[start])){
                return rotatedSortedArray(arr,start,mid-1,value);
            }else{
                return rotatedSortedArray(arr,mid+1,end,value);
            }
        }else if(arr[mid]<arr[end]){
            if((value <= arr[end] && value > arr[mid])){
                return rotatedSortedArray(arr,start,mid-1,value);
            }else{
                return rotatedSortedArray(arr,mid+1,end,value);
            }
        }
        return true;
    }
}
