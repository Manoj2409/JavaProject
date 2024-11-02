package fundamentals.Collections.LeetCodeSetUp;

public class passThePillow {
    public static void main(String[] args) {
        //passThePillow(3,2);
        numWaterBottles(15,4);
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles=0,emptybottles=0,exchangedBottles=0,ans=numBottles;
        for(;numBottles>0;){
            totalBottles=totalBottles+numBottles;//15
            emptybottles=emptybottles+numBottles;
            exchangedBottles=emptybottles/numExchange;
            emptybottles=emptybottles%numExchange;
            numBottles=exchangedBottles;
        }
        System.out.println(totalBottles);
        return totalBottles;
    }
    public static int passThePillow(int n, int time) {
        int ans1=0;
        ans1=(time%(2*(n-1)))+1;
        if(ans1<=n){

        } else if (ans1>n) {
            ans1=2*(n-1)-ans1+2;
        }
        System.out.println(ans1);
        return ans1;
    }
}
