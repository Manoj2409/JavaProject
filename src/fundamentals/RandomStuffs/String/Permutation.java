package fundamentals.RandomStuffs.String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
       /* String input="abc";
        permutations("",input);*/
        ArrayList<String> list=permutationsArrayList("","abc");
        list.forEach(System.out::println);
    }
    static ArrayList<String> permutationsArrayList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> answer=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            answer.addAll(permutationsArrayList(f+ch+s,up.substring(1)));
        }
        return answer;
    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
    }
}