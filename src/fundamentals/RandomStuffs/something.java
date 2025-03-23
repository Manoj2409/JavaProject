package fundamentals.RandomStuffs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class something {
    public static void main(String[] args) {
        /*int[] nums ={1,3,2,1,5,4};
        int k=2;
        int result=sumOfGoodNumbersleetcode(nums,k);
        System.out.println(result);*/
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the input : ");
        String string=sc.next();
        getOccurances(string);
    }

    public static void getOccurances(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            map.put(string.charAt(i), map.getOrDefault(string.charAt(i), 0) + 1);
        }
        System.out.println(map);
    }



    public static int sumOfGoodNumbersleetcode(int[] nums, int k){
        int total=0;
        int length=nums.length;
        if(length==0){
            return 0;
        }
        for(int i=0;i<length;i++){
            //we have after element, we have before element and no element and after element
            Boolean beforeElement=i-k >= 0 && i-k<length;
            Boolean afterElement=i+k >= 0 && i+k<length;
            Boolean bothElement=beforeElement&&afterElement;
            Boolean noElement=!(beforeElement||afterElement);
            if(noElement){
                total=total+nums[i];
            }else if(bothElement){
                if(nums[i+k]<nums[i] && nums[i-k]<nums[i]){
                    total=total+nums[i];
                }
            } else if (afterElement) {
                if(nums[i+k]<nums[i]){
                    total=total+nums[i];
                }
            } else if (beforeElement) {
                if(nums[i-k]<nums[i]){
                    total=total+nums[i];
                }
            }
        }
        return total;
    }


    public static boolean palindrome(String s){
        //what are all the conditions that filter non-alphanumeric value
        for(int startPointer=0,endpointer=s.length()-1;startPointer<s.length() && endpointer>=0;){
            char currFirst = s.charAt(startPointer);
            char currLast = s.charAt(endpointer);
            if (!Character.isLetterOrDigit(currFirst )) {
                startPointer++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                endpointer--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;

                }
                startPointer++;
                endpointer--;
            }
        }
        return true;
    }


    public static int GCD(int n1,int n2){
        for(;n1>0 && n2>0;){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0) return n2; else return n1;
    }
}
