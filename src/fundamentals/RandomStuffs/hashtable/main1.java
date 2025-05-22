package fundamentals.RandomStuffs.hashtable;

import java.util.*;

public class main1 {

    public static List<List<String>> groupAnagrams(String[] strings){
        // Using a HashMap to group words with the same character frequency
        HashMap<String, LinkedList<String>> anagramGroups = new HashMap<>();

        for (String str : strings) {
            // Convert string into a character array, sort it, and use it as a key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            // If the key exists, add to the list, otherwise create a new one
            anagramGroups.putIfAbsent(sortedKey, new LinkedList<>());
            anagramGroups.get(sortedKey).add(str);
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        // Convert map values into a linked list of linked lists
        return new LinkedList<>(anagramGroups.values());
    }




    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

}
