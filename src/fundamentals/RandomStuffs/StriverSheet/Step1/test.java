package fundamentals.RandomStuffs.StriverSheet.Step1;

public class test {
    public static void main(String[] args) {
        Integer a=10;
        Integer b=a;
        a=11;
        System.out.println(b);
    }
    static int dataTypeSize(String str) {
        // code here

        switch(str){
            case "Character":
                return 2;
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            default:
                return -1;
        }

    }
    public static String compareNM(int n, int m) {
     if(n<m){
         return "lesser";
     }else if(n==m){
         return "equal";
     }else{
         return "greater";
     }
    }
    static int[] passedBy(int a, int b) {
        // code here
        int[] t ={a+1,b+2};
        return t;
    }
}
