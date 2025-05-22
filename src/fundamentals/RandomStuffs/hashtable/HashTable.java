package fundamentals.RandomStuffs.hashtable;

import java.util.ArrayList;

public class HashTable {
    public Node[] dataMap;
    private int size=7;
    public HashTable(){
        dataMap=new Node[size];
    }
    public class Node{
        private String key;
        private int value;
        private Node next;
        public Node(String key, Integer value){
            this.key=key;
            this.value=value;
        }
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public int hash(String key){
        char[] arr=key.toCharArray();
        int hash=0;
        for(char temp:arr){
            //take char in string and convert to ascii and multiply it by 23, sum it up
            hash=(hash+(int)temp*23)% dataMap.length;
        }
        return hash;
    }
    //approach towards set method
    //1. fit the element in the data map produced by hashing, if there are no values in that specific data map array
    //2. if already existing array in that data map create a new node and fit it


    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            for (;temp.next != null;) {
                if (temp.key == key) {
                    temp.value += value;
                    return;
                }
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public int get(String key){
        //input : String and output as value , handle if there is no element present, and null
        if(key==null){
            System.out.println("Null cannot be returned");
        }
        //present or not
        int hash= hash(key);//return int from 0-6
        for(;dataMap[hash]!=null;){
            if((dataMap[hash].key).equals(key)){
                return dataMap[hash].value;
            }
            dataMap[hash]=dataMap[hash].next;
        }
        return 0;
    }
    public ArrayList<String> keys(){
        ArrayList<String> arrayList=new ArrayList<>();
        for(int i=0;i<dataMap.length;i++){//0-6
            Node temp=dataMap[i];
            for(;temp!=null;){
                arrayList.add(temp.key);
                temp=temp.next;
            }
        }
        return arrayList;

    }
}
