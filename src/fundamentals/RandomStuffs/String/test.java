package fundamentals.RandomStuffs.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String str="abceasd128765";
        //need to store characters and numbers individually in ascending order
        LogicImplementation(str);

    }

    public static void LogicImplementation(String str){
        str.toLowerCase();
        List<Character> characterList=new ArrayList<>();
        List<Character> numberList=new ArrayList<>();

        for(Character character:str.toCharArray()){
            if(character>='a' && character<='z'){
                characterList.add(character);
            }else{
                numberList.add(character);
            }
        }

        //need to sort this list
        Collections.sort(numberList);
        Collections.sort(characterList);

        //print the characters and numbers
        System.out.println(characterList);
        System.out.println(numberList);
    }

}
