package datastructures.collectionsdatastructures.HashTable;

import java.util.ArrayList;

//to handle collision - two ways separate chaining and linear probing
//below we use separate chaining by implementing linked list

public class HashTable   {
    private int size=7;
    private Node[] dataMap;

    class Node{
        public String key;
        public int value;
        public Node next;

         Node(String key,int value){
            this.value=value;
            this.key= key;
        }
    }
    public HashTable(){
        dataMap=new Node[size];
    }
    public void printTable(){
        for(int i=0;i<dataMap.length;i++){
            System.out.print(i+":");
            for(Node temp=dataMap[i];temp!=null;temp=temp.next){
                System.out.print(" {"+temp.key+","+temp.value+"}"+",");
            }
            System.out.println();
        }
    }
    private int hash(String key){
        int hash=0;
        char[] keyChars=key.toCharArray();
        for(int i=0;i<keyChars.length;i++){
            int asciivalue=keyChars[i];
            hash=(hash+ asciivalue*23)%dataMap.length;
        }
        return hash;
    }
    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            if (temp.key == key) {
                temp.value += value;
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
                if (temp.key == key) {
                    temp.value += value;
                    return;
                }
            }
            temp.next = newNode;
        }
    }
    public int get(String key){
        int index=hash(key);
        Node temp=dataMap[index];
        for(;temp!=null;temp=temp.next){
            if(temp.key==key){
                return temp.value;
            }
        }
        return 0;
    }
    public ArrayList keys(){
        ArrayList<String> arrayList=new ArrayList<>();
        for(int i=0;i<dataMap.length;i++){
            Node temp=dataMap[i];
            for(;temp!=null;temp=temp.next){
                arrayList.add(temp.key);
            }
        }
        return arrayList;
    }
}
