package dataStructures.Trees;

import java.net.BindException;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        //BSTtest();
        rBSTtest();
    }
    public static void rBSTtest(){
        BinarySearchTree rbst=new BinarySearchTree();
        rbst.insert(47);
        rbst.insert(21);
        rbst.insert(76);
        rbst.insert(18);
        rbst.insert(27);
        rbst.insert(52);
        rbst.insert(82);
       /* System.out.println(rbst.rContains(82));
        System.out.println(rbst.rContains(17));*/
        rbst.rInsert(10);


    }
    public  static void BSTtest(){
        BinarySearchTree bst=new BinarySearchTree();
        //System.out.println(bst.root);
        bst.insert(10);
        bst.insert(11);
        bst.insert(9);
        System.out.println(bst.root.value);
        System.out.println(bst.root.left.value);
        System.out.println(bst.root.right.value);

        System.out.println(bst.contains(10));
        System.out.println(bst.contains(12));
    }

}
