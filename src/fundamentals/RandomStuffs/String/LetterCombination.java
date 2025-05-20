package fundamentals.RandomStuffs.String;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
       /* ArrayList<String> list= letterCombinations("","2");
        list.forEach(System.out::println);*/
        /*System.out.println(foo('4'));*/
        List<String> stringList=dice("",4);
        stringList.forEach(System.out::println);

    }
    static List<String> dice(String p, int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> main=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
           main.addAll(dice(p+i,target-i));
        }
        return main;
    }
    //handle exception case inside helper
    static ArrayList<String> letterCombinations(String p, String up){
        if(up.isEmpty()){
            return new ArrayList<>();
        }else{
            return helper(p,up);
        }
    }
    static ArrayList<String> helper(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> answer=new ArrayList<>();
        String digit=up.substring(0,1);
        String string=foo(digit);
        for(char ch:string.toCharArray()){
            answer.addAll(helper(p+ch,up.substring(1)));
        }
        return answer;
    }

    static String foo(String ch){
        return switch (ch) {
            case "2" -> "abc";
            case "3" -> "def";
            case "4" -> "ghi";
            case "5" -> "jkl";
            case "6" -> "mno";
            case "7" -> "pqrs";
            case "8" -> "tuv";
            case "9" -> "wxyz";
            default -> "";
        };
    }
}
