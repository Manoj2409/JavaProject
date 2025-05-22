package fundamentals.RandomStuffs.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class subSequence {
    static List<String> list =new LinkedList<>();

    public static void main(String[] args) {
        /*String string="ab";
        //subseq("",string);
        //list.forEach(System.out::println);
        *//*ArrayList<String> list1=subSeqReturn("",string);
        list1.forEach(System.out::println);*//*
        subseqAcii("",string);*/

        //iterative method
        /*
        int arr[]={1,2,3};
        List<List<Integer>> outer=subset(arr);
        outer.forEach(System.out::println);
         */

        //without duplicate

        int arr[]={1,2,3};
        List<List<Integer>> outer=subsetWithoutDuplicates(arr);
        outer.forEach(System.out::println);

    }

    static void subseq(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    static ArrayList<String> subSeqReturn(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> stringArrayList=new ArrayList<>();
            stringArrayList.add(p);
            return stringArrayList;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subSeqReturn(p+ch,up.substring(1));
        ArrayList<String> right=subSeqReturn(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    //print the ascii values of the characters
    static void subseqAcii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseqAcii(p+ch,up.substring(1));
        subseqAcii(p+(ch+0),up.substring(1));
        subseqAcii(p,up.substring(1));
    }

    static List<List<Integer>> subset(int arr[]){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr){
            int size= outer.size();
            for(int n=0;n<size;n++){
                List<Integer> internal=new ArrayList<>(outer.get(n));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetWithoutDuplicates(int arr[]){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0,end=0;
        for(int i=0;i<arr.length;i++){
            if(i>1 && arr[i]==arr[i-1]) {
                start=end+1;
            }
            end=outer.size()-1;
            int size= outer.size();
            for(int n=start;n<size;n++){
                List<Integer> internal=new ArrayList<>(outer.get(n));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

}





