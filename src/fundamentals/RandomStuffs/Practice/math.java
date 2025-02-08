package fundamentals.RandomStuffs.Practice;

public class math {
    //fibonacci
    //anagram
    //count the letter in the given string
    //balanced string
    public static void main(String[] args) {
        Fibonacci(10);
    }
    public static void Anagram(){

    }
    public static void Fibonacci(int n){
        int f1=1,f2=1;
        System.out.print(f1+" "+f2);
        int f3=0;
        for(int i=1;i<n-1;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(" "+f3);
        }
    }
}
