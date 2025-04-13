package fundamentals.RandomStuffs.StriverSheet.Step1;

import java.util.HashMap;
import java.util.Map;

public class hashing {
    //find the number of occurrences of a character givens string
    public static void occurrences(String s){
        HashMap<Character,Integer> occurrences=new HashMap<>();
        for(Character character: s.toCharArray()){
            occurrences.put(character,occurrences.getOrDefault(character,0)+1);
        }
        System.out.println(occurrences);
    }

    //find the min and max of integer occurrence
    public static void integerOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (Integer integer : arr) {
            //occurrences.put(integer,occurrences.getOrDefault(integer,0)+1);

            if (occurrences.containsKey(integer)) {
                occurrences.put(integer, occurrences.get(integer) + 1);
            } else {
                occurrences.put(integer, 1);
            }

        }

        Integer maximum = null;
        maximum = 0;
        Integer maximum_occurrences = Integer.MIN_VALUE;
        Integer minimum = 0, minimum_occurrences = Integer.MAX_VALUE;
        for (Integer integer : occurrences.keySet()) {
            Integer count = occurrences.get(integer);

            if (count > maximum_occurrences) {
                maximum = integer;
                maximum_occurrences = count;
            }
            if (count < minimum_occurrences) {
                minimum = integer;
                minimum_occurrences = count;
            }
        }
        System.out.println(maximum+" : "+maximum_occurrences+"\n"+minimum+" : "+minimum_occurrences );
    }
    public static void main(String[] args) {
        //occurrences("hellothere");
        int arr[]={1,5,5,6,10,1,1,1,10};
        integerOccurrences(arr);
    }
}
