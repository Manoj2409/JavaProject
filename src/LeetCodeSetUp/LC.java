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
        //System.out.println(isPerfectSquare(4));
        /*int num[]={2,1,5};
        int k=806;
        System.out.println(addToArrayForm(num,k));
        */

        /*System.out.println(findTheWinner(5,2));*/

        /*
        String[] str={"d1/","d2/","../","d21/","./"};
        minOperations(str);
        */

        String s1 = "(abcd)";
       /* String s2 = "(abcd)";
        reverseParentheses(s2);
        String s3 = "(abcd)";
        reverseParentheses(s3);*/
    }
    public static int minOperations(String[] logs) {
        int counter=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("./")) {
                //nothing - remains in same folder
            } else if (logs[i].equals("../")) {
                if(counter!=0){
                    counter--;
                }
            }else{
                counter++;
            }
        }
        System.out.println(counter);

        return counter;
    }
    public static int findTheWinner(int n, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        Integer temp=0;
        for(;list.size()>1;){
            int temp2 = (temp + k - 1) % list.size();
            list.remove(temp2);
            temp=temp2;
        }
        int tem=list.get(0);
        return tem;
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        //convert to integer
        int integer=0,finalInteger=0;
        int counter=0;
        List<Integer> list=new ArrayList<>();
        for(int i= num.length-1;i>=0;i--,counter++){
            integer= integer+num[i]*(int) (Math.pow(10,counter));
        }
        System.out.println(integer);
        integer=integer+k;
        counter=0;
        for(int i=0;i<=6;i++){
            if(integer > (int) (Math.pow(10,i))){
                counter++;
            }
        }
        System.out.println(counter);
        int len=counter;
        counter=counter-1;
        System.out.println(integer);
        for(int i= 0;i<len;i++,counter--){
            finalInteger= integer / (int) (Math.pow(10,counter));
            integer=integer%(int) (Math.pow(10,counter));
            list.add(finalInteger);
        }
        System.out.println(list);
        return null;
        //add and convert to array
    }
    public static boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        for(int i=2;i<=num/2;i++){
            if(num%(i*i)==0){
                System.out.print(i);
                return true;
            }
        }
        return false;
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
