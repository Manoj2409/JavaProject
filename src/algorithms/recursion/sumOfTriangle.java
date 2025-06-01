package algorithms.recursion;

import java.util.ArrayList;

public class sumOfTriangle {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(getTriangle(arr).toString());

    }
    //static ArrayList<Integer> arrayList=new ArrayList<>();
    public static ArrayList<Integer> getTriangle(int[] arr) {
        // code
        ArrayList<Integer> arrayList=new ArrayList<>();
        solutionHelper(arr,0,arrayList);
        return arrayList;
    }
    static void solutionHelper(int[] arr,int startpoint,ArrayList<Integer> arrayList){
        //base condition
        if(startpoint==arr.length){
            return;
        }
        for(int i=arr.length-1;i>=startpoint;i--){
            arrayList.add(0,arr[i]);
        }
       //logic
        for(int i =arr.length-1;i>=startpoint+1;i--){
            arr[i]=arr[i]+arr[i-1];
        }
        solutionHelper(arr,startpoint+1,arrayList);
        //inserting


    }

}
