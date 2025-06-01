package problems.arrays;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        int nums[]={0,2,1,5,3,4};
        nums= buildArray2(nums);
        for(int i:nums){
            System.out.printf(i+" ");
        }
    }

    public static int[] buildArray2(int[] nums) {
        //time complexity : o(n) and space complexity o(n)
        int length=nums.length;
        for(int i=0;i<length;i++){
            nums[i]=nums[i]+length*(nums[nums[i]]%length);
        }
        for(int i=0;i<length;i++){
            nums[i]=nums[i]/length;
        }
        return nums;
    }

    public static int[] buildArray1(int[] nums) {
        //time complexity : o(n) and space complexity o(n)
        int length=nums.length;
        int[] newArr=new int[length];
        for(int i=0;i<length;i++){
            newArr[i]=nums[nums[i]];
        }
        return newArr;
    }
}
