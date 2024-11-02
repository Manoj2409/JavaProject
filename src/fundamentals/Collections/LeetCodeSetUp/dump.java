package fundamentals.Collections.LeetCodeSetUp;

import java.util.*;

public class dump {
    public static void main(String[] args) {
        /* time complexity O(n2)
        1.Convert all strings -> char array -> hashmap
        2.Compare each hashmap has same values, if yes add to a hashmap
         */
        /*int arr[]={-3,-1,0,0,0,3,3};
        removeDuplicates(arr);*/
       /* List<String> list1=new ArrayList<>();
        list1=fizzBuzz(15);
        System.out.println(list1);*/
        int nums[] = {3,3,4};
        int print=majorityElement(nums);
        System.out.println(print);
    }
    static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int len=nums.length,maxValue=0,val=0,maxKey=0;

        for (int element : nums) {
            if (hashMap.containsKey(element)) {
                // If the element is already in the hashmap, increment its count
                hashMap.put(element, hashMap.get(element) + 1);
            } else {
                // If the element is not in the hashmap, add it with a count of 1
                hashMap.put(element, 1);
            }
        }

            System.out.println(hashMap);

        for(HashMap.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue=entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey);


        return maxKey;
    }
    static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            hashMap.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(hashMap.containsKey(complement) && hashMap.get(complement)!=i){
                return new int[]{i,hashMap.get(complement)};//return
            }
        }

        return new int[]{};
    }
    static List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add(i-1,"FizzBuzz");
            } else if (i%3==0) {
                list.add(i-1,"Fizz");
            }else if(i%5==0){
                list.add(i-1,"Buzz");
            }else {
                list.add(i-1,Integer.toString(i));
            }
        }
        return list;
    }
    static int removeDuplicates(int[] nums) {
        TreeSet<Integer> hashSet=new TreeSet<>();
        for(int num:nums){
            hashSet.add(num);
        }
        Iterator<Integer> iterator= hashSet.iterator();
        for(int i=0;iterator.hasNext();i++){
            nums[i]=iterator.next();
        }
        for(int num:nums){
            System.out.println(num);
        }
        return hashSet.size();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            char[] Char=word.toCharArray();
            Arrays.sort(Char);
            String sortedWord = new String(Char);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());

    }



    static boolean isAnagram(String s, String t) {
        //(s+t) log(s+t)
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char i : s.toCharArray()){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);//setting default value of the key to 0
        }
        for(char i : t.toCharArray()){
            hashMap.put(i,hashMap.getOrDefault(i,0)-1);//setting default value of the key to 0
        }

        for(int i : hashMap.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
