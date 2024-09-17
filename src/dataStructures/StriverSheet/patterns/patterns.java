package dataStructures.StriverSheet.patterns;


public class patterns {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(5);
        //pattern7(6);
        //pattern8(3);
        //pattern9(3);
        //pattern10(4);
        //pattern11(5);
        //pattern12(4);
        //pattern13(5);
        //pattern14(5);
        //pattern15(5);
        //pattern16(5);
        //pattern17(4);
        //pattern18(5);
        //pattern19(8);
        //pattern20(5);
        //pattern21(5);
        pattern22(3);


    }


    private static void pattern22(int n) {
        int g1,g2,result;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                g1=Math.abs(i-n)+1;
                g2=Math.abs(j-n)+1;
                result=g1>g2?g1:g2;
                System.out.print(result);
            }
            System.out.println();
        }
    }
    private static void pattern21(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void pattern20(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++){
                if(j<=i){
                    System.out.print("*");
                } else if (j>=2*n-i+1) {
                    System.out.print("*");
                } else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=2*n;j++){
                if(j<=i){
                    System.out.print("*");
                } else if (j>=2*n-i+1) {
                    System.out.print("*");
                } else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    private static void pattern19(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i+1){
                    System.out.print("*");
                }
                else {
                    System.out.print("-");
                }
            }
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j<=n-i+1){
                    System.out.print("*");
                }
                else {
                    System.out.print("-");
                }
            }
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    private static void pattern18(int n) {
        char a;
        for(int i=1;i<=n;i++){
            a= (char) ('A'+n-i);

            for(int j=1;j<=i;j++,a++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    private static void pattern17(int n) {
        for(int i=1;i<=n;i++){
            char a='A';
            int j=1;
            //first part - space
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(;j<=n;j++,a++){
                System.out.print(a);
            }
            --a;
            for(;j<=n+i-1;j++){
                System.out.print(--a);
            }
            System.out.println();
        }
    }
    private static void pattern16(int n) {
        char a='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
            }
            a++;
            System.out.println();
        }
    }
    private static void pattern15(int n) {
        char a;
        for(int i=1;i<=n;i++){
            a='A';
            for(int j=1;j<=n-i+1;j++,a++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    private static void pattern14(int n) {
        char a;
        for(int i=1;i<=n;i++){
            a='A';
            for(int j=1;j<=i;j++,a++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    private static void pattern13(int n) {
        int counter=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                counter++;
                System.out.print(counter+" ");
            }
            System.out.println();
        }
    }
    private static void pattern12(int n) {
        for(int i=1;i<=n;i++){
            int j,s;
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(s=j;s<=2*n-i;s++){
                System.out.print(" ");
            }
            for(int k=s;k<=2*n;k++){
                System.out.print(2*n+1-k);
            }
            System.out.println();
        }
    }
    private static void pattern11(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    private static void pattern10(int n) {
        for(int i=1;i<=n*2-1;i++){
            int temp=i;
            if(temp>n){
                temp=n-(temp%n);
            }
            for(int j=1;j<=temp;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    private static void pattern9(int n) {
        for(int i=1;i<=n;i++){
            int j=1;
            //first part space
            for(;j<=n-i;j++){
                System.out.print(" ");
            }
            //print star
            for(;j<=n+i-1;j++){
                System.out.print("*");
            }
            //second part space
            for(;j<=n*2-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i=i-1){
            int j=1;
            //first part space
            for(;j<=n-i;j++){
                System.out.print(" ");
            }
            //print star
            for(;j<=n+i-1;j++){
                System.out.print("*");
            }
            //second part space
            for(;j<=n*2-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void pattern8(int n) {
        for(int i=n;i>=1;i=i-1){
            int j=1;
            //first part space
            for(;j<=n-i;j++){
                System.out.print(" ");
            }
            //print star
            for(;j<=n+i-1;j++){
                System.out.print("*");
            }
            //second part space
            for(;j<=n*2-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void pattern7(int n) {
        for(int i=1;i<=n;i++){
            int j=1;
            //first part space
            for(;j<=n-i;j++){
                System.out.print(" ");
            }
            //print star
            for(;j<=n+i-1;j++){
                System.out.print("*");
            }
            //second part space
            for(;j<=n*2-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static void pattern5(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    private static void pattern3(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static void pattern2(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
