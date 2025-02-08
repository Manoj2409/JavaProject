package fundamentals.RandomStuffs.binarysearchtree;

public class binarysearchtree {
public Node root;
    class Node{
        public int value;
        public Node right;
        public Node left;

        Node(int value){
        this.value=value;
        }
    }

    public boolean insert(int value){
        Node insert=new Node(value);
        //if there are any values similar to that of inserting value return false else insert the node
        if(root==null){
            root=insert;
            return true;
        }
        Node temp=root;
        for(;;){
            if(temp.value==insert.value){
                return false;
            } else if (insert.value<temp.value) {
                if(temp.left==null){
                    temp.left=insert;
                    return true;
                }
                temp=temp.left;
            }else if(insert.value > temp.value){
                if(temp.right ==null){
                    temp.right=insert;
                    return true;
                }
                temp=temp.right;
            }
        }
    }
    public boolean contains(int value){
        if(root==null){
            return false;
        }
        //Node contains=new Node(value);
        Node temp=root;
        for(;temp!=null;){
            if(value==temp.value){
                return true;
            }else if(value<temp.value){
                temp=temp.left;
            }else if(value>temp.value){
                temp=temp.right;
            }
        }
        return false;
    }

}
