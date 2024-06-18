package LeetCodeSetUp;

import java.util.*;

public class LC {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(containsDuplicate(arr));
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
    public static boolean isAnagram(String s, String t) {
        //O(n2) -> checking out each chars
        //is it possible to implement in hashset characters O(n)
        

        return false;
    }

}
