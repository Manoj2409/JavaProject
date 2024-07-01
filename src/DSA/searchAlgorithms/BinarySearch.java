package DSA.searchAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,12,14};
        //test from 0 to 15
        int print=0;
        int arr2[]={10,9,8,7,6,5,4,2,1,-1};
/*
        for(int i=0;i<=15;i++){
            print=binarySearch(arr,i);
            System.out.println("i : "+i+" val : "+print);
        }*/
        for(int i=-4;i<=12;i++){
            print= orderAgnosticBinarySearch(arr2,i);
            System.out.println("i : "+i+" val : "+print);
        }
    }

    static int binarySearch(int[] arr,int tar){
        int end=arr.length-1,start=0,mid=0;
        for(;start<=end;){
            mid=(start+end)/2;
            if(tar==arr[mid]){
                return mid;
            }
            if( tar < arr[mid] ){
                end=mid-1;
            } else if (tar>arr[mid]) {
                start=mid+1;
            } else {
                return -1;
            }
        }
        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int tar){
        int end=arr.length-1,start=0,mid=0;
        boolean ascOrder=arr[start]<arr[end];
        for(;start<=end;){
            mid=(start+end)/2;
            if(tar==arr[mid]){
                return mid;
            }
            if(ascOrder){
                if( tar < arr[mid] ){
                    end=mid-1;
                } else if (tar>arr[mid]) {
                    start=mid+1;
                } else {
                    return -1;
                }
            }
            else{
                if( tar > arr[mid] ){
                    end=mid-1;
                } else if (tar<arr[mid]) {
                    start=mid+1;
                } else {
                    return -1;
                }
            }

        }
        return -1;
    }
}
