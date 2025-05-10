package fundamentals.RandomStuffs.LeetCodeSetUp;

public class countTheSubArrays {
    public static void main(String[] args) {
        int arr[]={1,2,1,1};
        int result =countSubarrays(arr);
        System.out.println(result);
    }
    public static int countSubarrays(int nums[]){
        if(nums.length<3){
            return 0;
        }
        int len=nums.length-2,counter=0;
        for(int i=1;i<=len;i++){
            if((nums[i-1] + nums[i+1])*2 ==nums[i]){
                counter++;
            }

        }
        return counter;
    }
}
