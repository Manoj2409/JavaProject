package fundamentals.RandomStuffs.StriverSheet.Step1;

import static java.lang.Math.abs;

public class patterns {

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-1-i;j++){ // 1 -> 0,1,2
                System.out.print("-");
            }
            //star
            for(int j=0;j<2*i +1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-1-i;j++){ // 1 -> 0,1,2
                System.out.print("-");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){ // 1 -> 0,1,2
                System.out.print("-");
            }
            //star
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){ // 1 -> 0,1,2
                System.out.print("-");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-1-i;j++){ // 1 -> 0,1,2
                System.out.print("-");
            }
            //star
            for(int j=0;j<2*i +1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-1-i;j++){ // 1 -> 0,1,2
                System.out.print("-");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){ // 1 -> 0,1,2
                System.out.print("-");
            }
            //star
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){ // 1 -> 0,1,2
                System.out.print("-");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int i=1; i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10_dynamic(int n){
        int totalRows = 2 * n - 1;
        for (int i = 1; i <= totalRows; i++) {
            int stars = (i <= n) ? i : (2 * n - i); // Calculate stars dynamically
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int i=1;i<=n;i++){
            int nos=i;
            for(int j=1;j<=i;j++,nos++){
                System.out.print(nos%2+" ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for (int i = 1; i <= n; i++) {
                //numbers
                for(int k=1;k<=i;k++){
                    System.out.print(k);
                }

                for(int k=1;k<2*n-2*i;k++){
                    System.out.print("-");
                }

                //numbers
                for(int k=i;k>=1;k--){
                    System.out.print(k);
                }

            System.out.println();
        }
    }
    static void pattern13(int n){
        int somevalue=1;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++,somevalue++){
                System.out.print(somevalue+" ");
            }
        System.out.println();
        }
    }

    static void pattern14(int n){
        for (int i = 1; i <= n; i++) {
            Character a='A';
            for(int j=1;j<=i;j++,a++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for (int i = 1; i <= n; i++) {
            Character a='A';
            for(int j=1;j<=n+1-i;j++,a++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        Character a='A';
        for (int i = 1; i <= n; i++,a++) {
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            Character a= 'A';

            //characters
            for(int j=0;j<=i;j++,a++){
                System.out.print(a);
            }
            a= (char) (a-2);
            for(int j=i;j>0;j--,a--){
                System.out.print(a);
            }

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        for(int i=0;i<n;i++){
            //characters
            char a='A';
            int c=0;
            for(char s= (char) (a+(n-i-1));c<=i;s++,c++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
  /*  static void pattern19(int n){
        for(int i=0;i<2*n;i++){
            //stars
            for(int j=0;j<abs(n-i);j++){
                System.out.print("*");
            }
            //space
            int spacecouter=i;
            if(spacecouter>=n/2){
                spacecouter=n-spacecouter;
            }
            for(int j=0;j<2*spacecouter;j++){
                System.out.print("-");
            }
            //stars
            for(int j=0;j<abs(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(5);
        //pattern7(5);
        //pattern8(5);
        //pattern9(5);
        //pattern10(5);
        //pattern10_dynamic(5);
        //pattern11(5);
        //pattern12(5);
        //pattern13(5);
        //pattern14(5);
        //pattern15(5);
        //pattern16(5);
        //pattern17(5);
        //pattern18(5);
        //pattern19(3);

    }



}
