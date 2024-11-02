package fundamentals.Collections.StriverSheet.Math;

public class simpleMathProblems {
    public static void main(String[] args) {

        //GCD
        //GCDandLCM(14l, 8l);

        //GCD Euclidean approach
        //GCDandLCM(14l,8l);

        //sum of divisors
        //sumOfDivisors(5);
        //sumOfDivisorsUsingContributionTechnique(5);

    }


    public static void sumDivisor(int n){

        int endpoint= (int) Math.sqrt(n);
        int sum=0;
        for(int i=1;i<=endpoint;i++){
            if(n%i==0 && n/i != i){
                sum=sum+i+n/i;
            }else if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }


    private static Long sumOfDivisorsUsingContributionTechnique(int n) {
        Long sumOfDivisor= 0L;
        for(int i=1;i<=n;i++){
            sumOfDivisor=sumOfDivisor+(n/i)*i;
        }
        System.out.println(sumOfDivisor);
        return sumOfDivisor;

    }

    private static Long sumOfDivisors(int n) {
        Long sumOfDivisors= 0L;
        for(int t=1;t<=n;t++){
            int endpoint= (int) Math.sqrt(t);
            int sum = 0;
            for(int i=1;i<=endpoint;i++){
                if(t%i==0 && t/i !=i){
                    sum=sum+i+t/i;
                }else if(t%i == 0){
                    sum=sum+i;
                }
            }
            sumOfDivisors=sumOfDivisors+sum;
        }
        System.out.println(sumOfDivisors);
        return sumOfDivisors;

    }

    public static Long[] GCDandLCM(Long n1, Long n2){
        Long LCM;
        Long GCD=findGcd(n1,n2);
        LCM=(n1*n2)/GCD;
        System.out.println(LCM+"   "+GCD);
        return new Long[]{LCM,GCD};
    }
    public static Long findGcd(Long a, Long b) {
        while(a > 0l && b > 0l) {
            if(a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if(a == 0l) {
            return b;
        }
        return a;
    }

}
