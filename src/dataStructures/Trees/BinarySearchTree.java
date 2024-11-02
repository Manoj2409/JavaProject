package dataStructures.Trees;


public class BinarySearchTree {
    public Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }
    public boolean insert(int newValue){
        Node newNode=new Node(newValue);
        if(root==null){
            root=newNode;
            return true;
        }
        Node temp= root;
        for(;;){
            if(temp.value== newNode.value){
                return false;
            }
            if(temp.value>newNode.value) {
                if(temp.left==null){
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            } else  {
                if(temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;
            }
        }
    }

    public boolean contains(int newValue){
        Node temp= root;
        if(root==null)return false;
        for(;;){
            if(temp.value == newValue){
                return true;
            }
            if(temp.value>newValue) {
                if(temp.left!=null){
                    temp=temp.left;
                }else{
                    System.out.println("Cannot able to find the element ");
                    return false;
                }
            }
            else if(temp.value<newValue) {
                if(temp.right!=null){
                    temp=temp.right;
                }else{
                    System.out.println("Cannot able to find the element");
                    return false;
                }
            }
        }
    }
}
