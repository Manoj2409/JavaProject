package problems.arrays;

import java.util.ArrayList;

public class rotatearrays {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        rotate3(nums,k);
        for(int i:nums){
            System.out.printf(i+" ");
        }
    }
    public static void reverse(int[] arr,int start,int end){
        //reverse particular range in array
        int i=start;
        int j=end;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate3(int nums[],int k){
        if(nums.length<2){
            return;
        }
        k=k % nums.length;
        reverse(nums,0,nums.length-1-k);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }



    public static void rotate2(int[] nums,int k){
        k=k%nums.length;
        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();

        for(int i=nums.length-k;i<=nums.length-1;i++){
            arrayList2.add(nums[i]);
        }

        for(int i=0;i<nums.length-k;i++){
            arrayList1.add(nums[i]);
        }
        //System.out.printf(arrayList2.toString()+ arrayList1.toString());
        for(int i=0;i<k;i++){
          nums[i]=arrayList2.get(i);
        }
        int j=0;
        for(int i=k;i< nums.length;i++,j++){
            nums[i]=arrayList1.get(j);
        }


        for(int i:nums){
            System.out.printf(i+" ");
        }
    }
    public static void rotate1(int[] nums, int k) {
        k=k%nums.length;
        for(int i=1;i<=k;i++){
            pushOne(nums);
        }
        for(int i:nums){
            System.out.printf(i+" ");
        }
    }
    public static int[] pushOne(int[] nums){
        if(nums.length<=1){
            return nums;
        }

        int temp=nums[nums.length-1];
        for(int i=nums.length-1;i>=1;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=temp;
        return nums;
    }
}
