package problems.arrays;

public class moveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,3,0};
        moveZero(arr);
        for(int i:arr){
            System.out.printf(i+" ");
        }
    }
    static void moveZero(int[] arr){
        int p1=0,p2=0;
        for(;p2<arr.length;){
            if(arr[p2]==0){
                p2++;
            }else{
                arr[p1]=arr[p2];
                p1++;
                p2++;
            }
        }
        System.out.printf("P1 : "+p1+"\n"+"P2 : "+p2+"\n");
        for(;p1< arr.length;p1++){
            arr[p1]=0;
        }
    }
}
