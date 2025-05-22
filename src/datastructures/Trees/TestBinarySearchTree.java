package datastructures.Trees;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(9);
        binarySearchTree.insert(11);
        binarySearchTree.insert(6);
        //System.out.println(binarySearchTree.contains(6));
        //System.out.println(binarySearchTree);
    /*
        binarySearchTree.contains(111);
        binarySearchTree.contains(11);
        binarySearchTree.contains(10);
        binarySearchTree.contains(6);
    */   // binarySearchTree.rContains(111);
        binarySearchTree.insert(12);
        System.out.println(binarySearchTree.contains(12));
    }
}
