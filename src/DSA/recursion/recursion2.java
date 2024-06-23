package DSA.recursion;

import java.util.ArrayList;

public class recursion2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={1,23,4,2};
        int arr3[]={1,2,3,4,5,4,4,4,4,22,1,1};
        ArrayList<Integer> arrayList=new ArrayList<>();
        int i=0;
        arrayList=CountTarget(arr3,4,arrayList,i);
        System.out.println(arrayList);
       /* Boolean ans;
        ans=helper(arr2);
        System.out.println(ans);
    */}

    static ArrayList<Integer> CountTarget(int[] arr3, int tar,ArrayList<Integer> arrayList,int i) {
        //base case
        if(i>arr3.length-1){
            return arrayList;
        }
        if(arr3[i]==tar){
            arrayList.add(i);
        }
        return CountTarget(arr3,tar,arrayList,i+1);
    }

    //static int i=0;
    static Boolean helper(int arr[]){
        int i=0;
       return sortedOrNot(arr,i);
    }
    static Boolean sortedOrNot(int arr[],int i){
        if(arr[i]<arr[i+1]){
        if(i== arr.length-2)return true;
        ++i;}
        else {
            return false;
        }
        return sortedOrNot(arr,++i);
    }
}
