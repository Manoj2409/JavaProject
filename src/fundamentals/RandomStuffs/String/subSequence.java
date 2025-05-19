package fundamentals.RandomStuffs.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class subSequence {
    static List<String> list =new LinkedList<>();

    public static void main(String[] args) {
        String string="ab";
        //subseq("",string);
        //list.forEach(System.out::println);
        /*ArrayList<String> list1=subSeqReturn("",string);
        list1.forEach(System.out::println);*/
        subseqAcii("",string);
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
}





