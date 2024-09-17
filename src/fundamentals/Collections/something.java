package fundamentals.Collections;

public class something {
    public static void main(String[] args) {
        System.out.println(GCD(14,8));
        System.out.println(palindrome("a."));

    }
    public static boolean palindrome(String s){
        //what are all the conditions that filter non-alphanumeric value
        for(int startPointer=0,endpointer=s.length()-1;startPointer<s.length() && endpointer>=0;){
            char currFirst = s.charAt(startPointer);
            char currLast = s.charAt(endpointer);
            if (!Character.isLetterOrDigit(currFirst )) {
                startPointer++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                endpointer--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;

                }
                startPointer++;
                endpointer--;
            }
        }
        return true;
    }


    public static int GCD(int n1,int n2){
        for(;n1>0 && n2>0;){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0) return n2; else return n1;
    }
}
