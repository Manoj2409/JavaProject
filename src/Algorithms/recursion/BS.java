package Algorithms.recursion;

public class BS {
   // static int i=0;
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,10,1,2,3};
        int tar;
        for(int i=0;i<15;i++){
            int print=sortedBS(arr,i,0,arr.length-1);
            System.out.println(print);
        }
    }
    static int BS(int arr[], int tar,int start,int end){
        if(end >= start){
            int mid=start+(end-start)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(arr[mid]>tar){
                return BS(arr,tar,start,mid-1);
            }
            else if(arr[mid]<tar){
                return BS(arr,tar,mid+1,end);
            }
        }
        return -1;
        }
    static int sortedBS(int arr[], int tar,int start,int end) {

        if (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] == tar) {
                return mid;
            }
            //find the sorted part
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= tar && arr[mid] >= tar) {
                    return sortedBS(arr, tar, start, mid - 1);
                } else {
                    return sortedBS(arr, tar, mid + 1, end);

                }
            } else if (arr[end] >= arr[mid]) {
                if (arr[mid] <= tar && arr[end] >= tar) {
                    return sortedBS(arr, tar, mid + 1, end);
                } else {
                    return sortedBS(arr, tar, start, mid - 1);
                }
            }

        }
        return -1;
    }
}





    //rotated Binary search:
    //arr={4,5,6,7,8,1,2,3}
    //tar : 2
    //mid : 8
    //{4} : -1
//In short it will work for maximum element sorted will return an int

