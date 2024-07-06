package LeetCodeSetUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class canPlaceFlowers {
    public static void main(String[] args) {
        /*int arr[] = {1,0,0,0,1,0,0};
        boolean ans = canPlaceFlowers(arr, 2);
        System.out.println(ans);*/
        /*int arr[]={2,6,4,1};
        boolean ans = threeConsecutiveOdds(arr);
        System.out.println(ans);*/
        int arr1[]={1,2,2,1};
        int arr2[]={2,2};
        int[] arr3=intersection(arr1,arr2);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

    }
    static int[] intersection(int[] arr1,int[] arr2){

        HashMap<Integer,Integer> hashMap1=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int element : arr1) {
            if (hashMap1.containsKey(element)) {
                hashMap1.put(element, hashMap1.get(element) + 1);
            } else {
                 hashMap1.put(element, 1);
            }
        }
        System.out.println(hashMap1);
        for (int element : arr2) {
            if (hashMap1.containsKey(element) && hashMap1.get(element)>0) {
               hashMap1.put(element,hashMap1.get(element)-1);
               if(!list.contains(element)){
                   list.add(element);
               }

            }
        }


        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
    static boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1){
                return true;
            }
        }
        return false;
    }

    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowersCanBePlaced=0;
        boolean ans=false;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && flowerbed[i+1]==0){
                flowersCanBePlaced=flowersCanBePlaced+1;
                if(i+2<flowerbed.length){
                    i=i+2;
                    for(;flowerbed[i+1]==0 && flowerbed[i+2]==0 && i<flowerbed.length;i=i+2){
                        flowersCanBePlaced=flowersCanBePlaced+1;
                    }
                }

            }
        }
        System.out.println(flowersCanBePlaced);
        //ans= flowersCanBePlaced==n ? true:false;
        return flowersCanBePlaced==n ? true:false;
    }
}
