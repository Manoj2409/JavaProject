package LeetCodeSetUp;

public class minAndMax {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        System.out.println(thirdLargest(arr));
    }
    static int thirdLargest(int arr[]) {
        // Your code here
        int max1=Integer.MIN_VALUE+2;
        int max2=Integer.MIN_VALUE+1;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){

                    max3=max2;
                    max2=arr[i];
                }
            else if(arr[i]>max3){
                max3=arr[i];
            }
        }
        //System.out.println(max1+"\n"+max2+'\n'+max3);
        return max3;
    }
    /*public static int getMinMax(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        // Code Here
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return
    }*/
}
