package fundamentals.Collections.LeetCodeSetUp;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(5);
        ListNode listNode2=new ListNode(3);
        ListNode listNode3=new ListNode(1);
        ListNode listNode4=new ListNode(2);
        ListNode listNode5=new ListNode(5);
        ListNode listNode6=new ListNode(1);
        ListNode listNode7=new ListNode(2);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;
        listNode6.next=listNode7;
        listNode7.next=null;

        ListNode listNodeS1=new ListNode(3);
        ListNode listNodeS2=new ListNode(1);
        listNodeS1.next=listNodeS2;
        listNodeS2.next=null;
        nodesBetweenCriticalPoints(listNode1);


    }
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
            ListNode previous=head,mid=head.next,nxt=head.next.next;
            int itr=2,min=-1,max=-1;
            int tempMin = 0,tempMax=0,tempDiff,storeMin=Integer.MAX_VALUE,storeMax=0;
            List<Integer> list=new ArrayList<>();
            for(;nxt!=null;previous=previous.next,mid=mid.next,nxt=nxt.next){
                if((previous.val<mid.val && mid.val>nxt.val) ||
                        (mid.val< previous.val && mid.val< nxt.val)){
                    list.add(itr);
                }
                itr++;
            }
        System.out.println(list+" "+list.size());
            int counter=0;
            int len=list.size();
            if(list.size()>=2){
                storeMax=list.get(list.size()-1)-list.get(0);
            }
            for(int i=1;i<=len-1;i++){
                tempMin=list.get(i)-list.get(i-1);
                if(storeMin>tempMin){
                    storeMin=tempMin;
                }

            }
            if(storeMin==Integer.MAX_VALUE){
                storeMin=-1;
                storeMax=-1;
            }
        System.out.println(storeMin+"  "+storeMax);
        System.out.println("Counter : "+counter);
        return new int[]{storeMin,storeMax};
    }
    /*public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int storeMin=-1,storeMax=-1,storeDiff=0,tempDiff=0;
        ListNode tempHead=head,tempTail=head.next;

        for(;head.next.next!=null;head=head.next){//head.next.next!=null
            tempHead=head;
            tempTail=head.next;
            tempDiff=tempTail.val-tempHead.val;
            if(tempHead.val<tempTail.val){
                if(storeDiff<tempDiff){
                    storeMin=tempHead.val;
                    storeMax=tempTail.val;
                    storeDiff=tempDiff;
                }
                for(; tempTail.next.val>tempTail.val; tempTail=tempTail.next){
                    storeMax=tempTail.next.val;
                    storeDiff=tempTail.next.val-tempTail.val;
                }
            }
        }
        System.out.println(storeMin+" "+storeMax);
        return new int[]{storeMin,storeMax};
    }*/
}
