package fundamentals.RandomStuffs.String;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class subSequence {
    static List<String> list =new LinkedList<>();

    public static void main(String[] args) {
        String string="abc";
        subseq("",string);
        list.forEach(System.out::println);
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

}
