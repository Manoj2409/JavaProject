package datastructures.collectionsdatastructures.pointers;

import java.util.HashMap;

public class ptrs {
    public static void main(String[] args) {
        //stores as values and not as pointing
        int a=100;
        int b=a;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        a=10;
        System.out.println("After changing value in b variable");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        //map stores as pointer
        HashMap<String,Integer> hashMap1=new HashMap<>();
        hashMap1.put("Thanos",1);
        HashMap<String,Integer> hashMap2=hashMap1;
        System.out.println("HMap 1: "+hashMap1);
        System.out.println("HMap 2: "+hashMap2);
        hashMap1.put("Thanos",2);
        System.out.println("after changing values in hashmap1");
        System.out.println("HMap 1: "+hashMap1);
        System.out.println("HMap 2: "+hashMap2);

    }
}
