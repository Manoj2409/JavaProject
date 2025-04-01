package fundamentals.RandomStuffs.binarysearchtree;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Test: Convert an empty array
        System.out.println("\n----- Test: Convert Empty Array -----\n");
        checkBalancedAndCorrectTraversal(new int[]{}, Arrays.asList());

        // Test: Convert an array with one element
        System.out.println("\n----- Test: Convert Single Element Array -----\n");
        checkBalancedAndCorrectTraversal(new int[]{10}, Arrays.asList(10));

        // Test: Convert a sorted array with odd number of elements
        System.out.println("\n----- Test: Convert Sorted Array with Odd Number of Elements -----\n");
        checkBalancedAndCorrectTraversal(new int[]{1, 2, 3, 4, 5}, Arrays.asList(1, 2, 3, 4, 5));

        // Test: Convert a sorted array with even number of elements
        System.out.println("\n----- Test: Convert Sorted Array with Even Number of Elements -----\n");
        checkBalancedAndCorrectTraversal(new int[]{1, 2, 3, 4, 5, 6}, Arrays.asList(1, 2, 3, 4, 5, 6));

        // Test: Convert a large sorted array
        System.out.println("\n----- Test: Convert Large Sorted Array -----\n");
        checkBalancedAndCorrectTraversal(
                Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}).toArray(),
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
    }


    private static void checkBalancedAndCorrectTraversal(int[] nums, List<Integer> expectedTraversal) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.sortedArrayToBST(nums);
        boolean isBalanced = bst.isBalanced();
        List<Integer> inorder = bst.inorderTraversal();
        System.out.println("Is balanced: " + isBalanced);
        System.out.println("Inorder traversal: " + inorder);
        System.out.println("Expected traversal: " + expectedTraversal);
        if (isBalanced && inorder.equals(expectedTraversal)) {
            System.out.println("PASS: Tree is balanced and inorder traversal is correct.\n");
        } else {
            System.out.println("FAIL: Tree is either not balanced or inorder traversal is incorrect.\n");
        }
    }

}


