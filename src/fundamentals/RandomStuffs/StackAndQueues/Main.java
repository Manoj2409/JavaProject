package fundamentals.RandomStuffs.StackAndQueues;

import fundamentals.RandomStuffs.rough.Stack;

public class Main {

    // WRITE THE REVERSESTRING METHOD HERE //
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////
    public static String reverseString(String string){
        Stack<Character> stack=new Stack<>();

        for(Character c:string.toCharArray()){
            stack.push(c);
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(Character c:string.toCharArray()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }



    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

}
