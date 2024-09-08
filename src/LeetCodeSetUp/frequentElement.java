package LeetCodeSetUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class frequentElement {
    public static void main(String[] args) {
        /*int[] arr={1,2};
        List<Integer> print=majorityElement(arr);
        System.out.println(print);*/
    }
    static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int len=nums.length,maxValue=0,val=0,maxKey=-1;
        List<Integer> list=new ArrayList<>();

        for (int element : nums) {
                if (hashMap.containsKey(element)) {
                    // If the element is already in the hashmap, increment its count
                    hashMap.put(element, hashMap.get(element) + 1);
                } else {
                    // If the element is not in the hashmap, add it with a count of 1
                    hashMap.put(element, 1);
                }
        }

        for(HashMap.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue() > len/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
    static int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int len=nums.length,maxValue=0,val=0,maxKey=-1;

        for (int element : nums) {
            if(element % 2 == 0){
                if (hashMap.containsKey(element)) {
                    // If the element is already in the hashmap, increment its count
                    hashMap.put(element, hashMap.get(element) + 1);
                } else {
                    // If the element is not in the hashmap, add it with a count of 1
                    hashMap.put(element, 1);
                }
            }
        }

//            System.out.println(hashMap);

        for(HashMap.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue() > maxValue || (entry.getValue()==maxValue && entry.getKey()<maxKey)){
                maxValue=entry.getValue();
                maxKey = entry.getKey();
            }
        }
        //      System.out.println(maxKey);
        return maxKey;
    }
}
