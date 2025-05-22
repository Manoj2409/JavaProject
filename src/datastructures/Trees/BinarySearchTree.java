package datastructures.Trees;

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
    //using recursion
    private boolean rContains(Node currentNode,int value){
        //base condition
        if(currentNode==null){
            System.out.println("Cannot able to find the element in bt");
            return false;}
        if(currentNode.value==value) return true;

        if(value<currentNode.value){
            return rContains(currentNode.left, value);
        }else {
            return rContains(currentNode.right,value);
        }
    }
    public boolean rContains(int value){
        return rContains(root,value);
    }

    private Node rInsert(Node currentNode,int value){
        if(currentNode==null)return new Node(value);
        if(value<currentNode.value){
            currentNode.left=rInsert(currentNode.left,value);
        }else if(value> currentNode.value){
            currentNode.right=rInsert(currentNode.right,value);
        }
        return currentNode;
    }

    public void rInsert(int value){
        if(root==null) root=new Node(value);
        rInsert(root,value);
    }

    public boolean contains(int newValue){
        Node temp= root;
        if(root==null)return false;
        for(;;){
            if(temp==null){
                System.out.println("cannot able to find the value in BT");
                return false;
            }
            if (temp.value == newValue){
                System.out.println(true);
                return true;
            } else if (newValue < temp.value) {
                temp=temp.left;
            } else if(newValue > temp.value){
                temp=temp.right;
            }
        }
        /*for(;;){
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
        }*/
    }

}
