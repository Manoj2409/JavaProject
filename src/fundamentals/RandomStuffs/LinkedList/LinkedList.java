package fundamentals.RandomStuffs.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LinkedList {


    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) {
              this.val = val; }
          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next; }
     }
    public static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(4);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(2);
        ListNode listNode5=new ListNode(5);
        ListNode listNode6=new ListNode(2);


        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;
        listNode6.next=null;

       /* Node node1=new Node(3);
        Node node2=new Node(2);
        Node node3=new Node(0);
        Node node4=new Node(-4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;*/

        //reverseList(listNode1);
        //System.out.println(findTheMiddleNode(listNode1).val);
        //System.out.println(palindrome(listNode1));
        //System.out.println(hasCycle2(listNode1));
        //System.out.println(getKthFromLast(node1,1));

        System.out.println(partition(listNode1,3));
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode leftStart = new ListNode(0);
        ListNode rightStart = new ListNode(0);
        ListNode left = leftStart;
        ListNode right = rightStart;

        for(;head != null;head = head.next) {
            if(head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
        }
        right.next = null;
        left.next = rightStart.next;
        return leftStart.next;
    }
    public static int getKthFromLast(Node head, int k) {
        if (head == null)
            return -1;
        Node temp = head;
        //for fastpointer
        Node temp1=head;
        for(int counter=0;counter<k;counter++,temp1=temp1.next){
            if(temp1==null){
                return -1;
            }
        }
        for(;temp1!=null;temp=temp.next,temp1=temp1.next){

        }
        return temp != null ? temp.data : -1;
    }
    public static boolean hasCycle1(ListNode head) {
        //edge cases
        if(head==null || head.next==null || head.next.next==null){
            return false;
        }
        //two pointer approach
        ListNode slowpointer=head;
        ListNode fastpointer=head.next.next;

        for(;;slowpointer=slowpointer.next,fastpointer=fastpointer.next.next){
            if(fastpointer.next==null || fastpointer.next.next==null){
                return false;//does not have a loop
            }
            if(slowpointer.val==fastpointer.val){
                return true;//does have a loop
            }

        }
    }
    public static boolean hasCycle2(ListNode head) {
        //edge cases
        if(head==null || head.next==null || head.next.next==null || head.next.next.next==null){
            return false;
        }
        //three pointer approach
        ListNode slowpointer=head;
        ListNode fastpointer1=head.next;
        ListNode fastpointer2=head.next.next;
        for(;;slowpointer=slowpointer.next,fastpointer1=fastpointer1.next.next,fastpointer2=fastpointer2.next.next.next){
            if(fastpointer2.next==null || fastpointer2.next.next==null ||fastpointer2.next.next.next==null){
                return false;//does not have a loop
            }
            if(slowpointer.val==fastpointer1.val ||fastpointer1.val==fastpointer2.val ||fastpointer2.val== slowpointer.val){
                return true;//does have a loop
            }

        }
    }
    private static ListNode findTheMiddleNode(ListNode head) {
            if(head==null){
                return null;
            }
            if(head.next==null){
                return head;
            }
            ListNode slow=head,fast=head;
            for(;;slow=slow.next,fast=fast.next.next){
                if(fast.next==null){
                    return slow;
                }else if(fast.next.next==null){
                    return slow.next;
                }
            }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode temp=head;
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        Stack<Integer> stack=new Stack<>();
        for(;temp!=null;temp=temp.next){
            stack.push(temp.val);
            //pushing
            //System.out.println(temp.val);
        }
        temp=head;
        for(;temp!=null;temp=temp.next){
            temp.val=stack.peek();
            stack.pop();
        }
        System.out.println(head.val);
        return head;
    }
    public static boolean palindrome(ListNode head) {
        ListNode temp=head;

         if(head.next==null){
            return true;
        }
        List<Integer> linkedList1=new ArrayList<>();
        List<Integer> linkedList2=new Stack<Integer>();
        for(;temp!=null;temp=temp.next){
            linkedList1.add(temp.val);
            //pushing
            //System.out.println(temp.val);
        }
        //System.out.println("Stack : "+linkedList);
       // System.out.println("Stack reversed : "+linkedList.reversed());
        linkedList2= linkedList1.reversed();
        /*for(int i=0;i<linkedList.size();i++){
            linkedList.equals(stack2)
            //pushing
            //System.out.println(temp.val);
        }*/
        if(linkedList1.equals(linkedList1.reversed())){
            return true;
        }else{
            return false;
        }
    }
}