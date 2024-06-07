package rough.Collections.list;

import java.util.LinkedList;
//Use an ArrayList for storing and accessing data, //
// LinkedList to manipulate data.
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("my");
        linkedList.add("name");
        linkedList.add("is");
        linkedList.add("Manoj");

        System.out.println(linkedList);
        linkedList.set(2,"naamme");
        System.out.println(linkedList);


    }
    public static void print(String string){
        System.out.println(string);
    }
    public static void print(int string){
        System.out.println(string);
    }
}
