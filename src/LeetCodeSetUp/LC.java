package LeetCodeSetUp;

import java.util.*;

public class LC {
    
    public static void main(String[] args) {
       /* int[] arr={0,1,1,1,1,2,2,2,3,3,3,4,4};
        System.out.println("Length : "+arr.length);//5
        int print=0;
        print=removeDuplicates(arr);
        System.out.println(print);*/
       /* int s=36;
        mySqrt(s);*/

    }
    //
    static boolean isAnagram(String s, String t) {
        //O(nog n)
        //convert to character array and sort
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
    static int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
    static int removeDuplicates(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }


        return hashSet.size();
    }
    public static boolean containsDuplicate(int[] nums) {



        if(nums.length==0){
            System.out.println("0");
            return false;
        }

        HashSet<Integer> hashSet
                =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hashSet.contains(nums[i])){
                return true;
            }
            hashSet.add(nums[i]);
        }
        return false;
    }


}
