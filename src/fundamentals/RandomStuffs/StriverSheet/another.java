package fundamentals.RandomStuffs.StriverSheet;

import java.util.*;

public class another {
    public static void main(String[] args) {
        List<List<String>> mainlists= new ArrayList<>();
        List<String> list1=new ArrayList<>();
        //List<String> list2=new ArrayList<>();
        //List<String> list3=new ArrayList<>();
        //List<String> list4=new ArrayList<>();
        list1.add("inx");
        list1.add("inx");

        list1.add("gv");
        list1.add("inx");
       /* list1.add("good");
        list1.add("ok");
        list1.add("good");
        list1.add("ok");

        list2.add("ok");
        list2.add("bad");
        list2.add("good");
        list2.add("ok");
        list2.add("ok");

        list3.add("good");

        list4.add("bad");
*/
        mainlists.add(list1);
  //      mainlists.add(list2);
    //    mainlists.add(list3);
      //  mainlists.add(list4);

        System.out.println(mainlists);
        String word=findCommonResponse(mainlists);
        System.out.println(word);
    }
        public static String findCommonResponse(List<List<String>> responses) {
            List<Set<String>> listOfSets = new ArrayList<>();

            for (List<String> innerList : responses) {
                listOfSets.add(new HashSet<>(innerList));
            }
            System.out.println(listOfSets);
            //create a hashmap and iterate each string and find the string with the largest occurrences
            HashMap<String, Integer> hashMap=new HashMap<>();
            for (Set<String> innerList : listOfSets) {
                for(String response:innerList){
                    hashMap.put(response,hashMap.getOrDefault(response,0)+1);
                }
            }
            //System.out.println(hashMap);
            String maxResponse = null;
            int maxCount = 0;
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                String currentResponse = entry.getKey();
                int currentCount = entry.getValue();
                if (maxResponse == null) {
                    maxResponse = currentResponse;
                    maxCount = currentCount;
                    continue;
                }
                if (currentCount > maxCount) {
                    maxResponse = currentResponse;
                    maxCount = currentCount;
                }
                else if (currentCount == maxCount) {
                    if (currentResponse.compareTo(maxResponse) < 0) {
                        maxResponse = currentResponse;
                    }
                }
            }
            //System.out.println(maxCount);
            return maxResponse;
        }

}
