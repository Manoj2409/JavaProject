package fundamentals.RandomStuffs.Practice;

import java.util.*;

public class moreStrings {

    public static void main(String[] args) {
            /*String string="My name is Manoj";
            reverseTheWordsInSentence(string);*/
        // isPrime(10);
       // palindrome("racecar");
        /*Integer arr[]={10,1,3,5,7,2,11};
        secondMinAndMax(arr);*/
        //playSwap();
       /* isAnagram("triangle", "integral");
        isAnagram("aaa", "aaab");*/
        //Learn();
        fibonacci(10);

    }
    public static void fibonacci(Integer n){
        Integer f0=0;
        Integer f1=1;
        Integer f2=null;
        List<Integer> list=new ArrayList<>();
        list.add(f0);
        list.add(f1);

        for(Integer i=0;i<n;i++){
            f2=f0+f1;
            list.add(f2);
            f0=f1;
            f1=f2;
        }
        System.out.println(list);
    }
    public static void Learn(){
        Integer[] numbers={1,10,11,10,10,9,8,7,6,5,4,3,2,1,1,1,1};
        //list
        List<Integer> list=new ArrayList<>();
        for(Integer integer:numbers){
            list.add(integer);
        }
        list.sort(null);
        System.out.println("List : "+list);

        //set
        //don't want duplicate elements and unordered
        Set<Integer> integerSet=new HashSet<>();
        for(Integer integer:numbers){
            integerSet.add(integer);
        }
        System.out.println("Set : "+integerSet);

        //Tree set - order and no  duplicate
        TreeSet<Integer> integerTreeSet= new TreeSet<>();
        for(Integer integer:numbers){
            integerTreeSet.add(integer);
        }
        System.out.println("Tree Set : "+integerTreeSet);
    }

    public static void isAnagram(String string1, String string2){
        char[] arrStr1 = string1.toCharArray();
        char[] arrStr2 = string2.toCharArray();

        // sort both char[] arrays
        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);
        System.out.println(Arrays.equals(arrStr1,arrStr2));
    }
    public static void playSwap(){
        int a=10;
        int b=10;
        a=a+b;//25 15
        b=a-b;//25 10
        a=a-b;//15 10
        System.out.println(a+"  "+b);


    }
    public static void secondMinAndMax(Integer[] arr){
        List<Integer> list=new ArrayList<>();
        for(Integer integer:arr){
            list.add(integer);
        }
        list.sort(null);
        System.out.println(list.get(1));
        System.out.println(list.get(list.size()-2));
    }
    public static void palindrome(String string){
        StringBuilder stringBuilder=new StringBuilder(string);
        if(stringBuilder.toString().equals(stringBuilder.reverse().toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    public static void reverseTheWordsInSentence(String string){
            //reverse the words from the sentence and print it out
        string=string.toLowerCase();
        String[] newString=string.split(" ");
        StringBuilder reversed=new StringBuilder();
        for(int i= newString.length-1;i>= 0;i--){
            reversed=reversed.append(newString[i]+" ");
        }
        System.out.println(reversed);
    }
    public static void isPrime(int number){
        if(number<=1){
            System.out.println("Not a prime number");
            return;
        }
        int flag=0;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0) System.out.println("Prime number");
        else if(flag==1) System.out.println("Not a prime");

    }
}
