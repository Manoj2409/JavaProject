package datastructures.collectionsdatastructures.HashTable;

public class test {
    public static void main(String[] args) {
        HashTable hashTable=new HashTable();
        hashTable.set("nails",10);
        hashTable.set("nails",10);
        hashTable.set("nut",1);
        hashTable.set("Thor",3);
        /*hashTable.printTable();
        System.out.println(hashTable.get("nails"));
        System.out.println(hashTable.get("something"));*/
        System.out.println(hashTable.keys());
    }
}
