package fundamentals.RandomStuffs.hashtable;

import fundamentals.RandomStuffs.rough.Stack;

import java.util.*;
import java.util.HashSet;
import java.util.Set;


public class Main {

public static int longestConsecutiveSequence(int[] arr){
    /*  1. import everything to set
        2. now it will be arranged, and now I will initialise two temp variable - longestSequence and tempSequence
        3. update when sequence reaches the end/ sequence breaks
        4. do till die
     */
    Set<Integer> set=new HashSet<>();
    int longestSequence=0,temporarySequece=1;
    //n times
    for(int i:arr){
        set.add(i);
    }
    Iterator<Integer> iterator=set.iterator();
    if(set.isEmpty() || set.size()==1){
        return set.size();
    }
    LinkedList<Integer> list=new LinkedList<>();

    int temp;

    for(;iterator.hasNext();){
        temp= iterator.next();
        list.add(temp);
        //find a way
        if(list.get(list.size()-1)+1!=temp){
            temporarySequece++;
            if(temporarySequece>longestSequence){
                longestSequence=temporarySequece;
            }
        }else{
            temporarySequece=1;
        }
        System.out.print(temp+" ");

    }


    return 0;
}





    public static void main(String[] args) {
        testLongestConsecutiveSequence("Consecutive Integers", new int[] {1, 2, 3, 4, 5}, 5);
       /* testLongestConsecutiveSequence("No Sequence", new int[] {1, 3, 5, 7, 9}, 1);
        testLongestConsecutiveSequence("Duplicates", new int[] {1, 2, 2, 3, 4}, 4);
        testLongestConsecutiveSequence("Negative Numbers", new int[] {1, 0, -1, -2, -3}, 5);
        testLongestConsecutiveSequence("Empty Array", new int[] {}, 0);
        testLongestConsecutiveSequence("Multiple Sequences", new int[] {1, 2, 3, 10, 11, 12, 13}, 4);
        testLongestConsecutiveSequence("Unordered Elements", new int[] {5, 1, 3, 4, 2}, 5);
        testLongestConsecutiveSequence("Single Element", new int[] {1}, 1);
        testLongestConsecutiveSequence("All Identical Elements", new int[] {2, 2, 2, 2, 2}, 1);
 */   }

    /**
     * Test method for longestConsecutiveSequence.
     * @param title Title of the test
     * @param nums Input array
     * @param expected Expected result
     */
    private static void testLongestConsecutiveSequence(String title, int[] nums, int expected) {
        System.out.println("Test: " + title);
        System.out.print("Testing array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int result = longestConsecutiveSequence(nums);
        System.out.println("Expected longest streak: " + expected);
        System.out.println("Actual longest streak: " + result);

        if (result == expected) {
            System.out.println("PASS\n");
        } else {
            System.out.println("FAIL\n");
        }
    }

}
