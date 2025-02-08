package fundamentals.RandomStuffs.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sdet {
    public static void main(String[] args) {
    //stringReverse("Manoj");
       /* int a[]={1,2,3,4,5,6,7,8,9,10};
        reverseArray(a);*/
        //reverse the words in the sentence
        // I love you
        //you love I
       // reverseTheWordsInSentence("My name is Manoj");
        System.out.println(anagram("listen","silent"));
    }
    public static boolean anagram(String a,String b){
        char[] character1=a.toCharArray();
        char[] character2=b.toCharArray();
        Arrays.sort(character1);
        Arrays.sort(character2);
        return Arrays.equals(character1,character2);
    }
    public static void reverseTheWordsInSentence(String sentence){
        List<String> list=new ArrayList<>();
        list= List.of(sentence.split(" "));
       // System.out.println(list);
        for(int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void reverseArray(int[] arr){
        int temp=0;

        //swap upto middle value
        for(int i=0;i<=arr.length/2;i++){
            //swap
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

        //print the array
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    public static void stringReverse(String string){
        String newstring="";
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=string.length()-1;i>=0;i--){
            stringBuilder.append(string.charAt(i));
        }
        newstring=stringBuilder.toString();
        System.out.println(newstring);
    }
}
