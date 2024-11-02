package dataStructures.Trees;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
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
        ;
    }
}
