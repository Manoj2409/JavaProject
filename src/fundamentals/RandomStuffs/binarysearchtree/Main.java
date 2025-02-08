package fundamentals.RandomStuffs.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        binarysearchtree binarysearchtree1=new binarysearchtree();
        binarysearchtree1.insert(1);
        binarysearchtree1.insert(2);
        binarysearchtree1.insert(3);
        binarysearchtree1.insert(4);
        binarysearchtree1.insert(5);

        //check contains
        System.out.println(binarysearchtree1.contains(1));//true
        System.out.println(binarysearchtree1.contains(0));//false
        System.out.println(binarysearchtree1.contains(2));//true
        System.out.println(binarysearchtree1.contains(5));//true
        System.out.println(binarysearchtree1.contains(7));//false
        System.out.println(binarysearchtree1.contains(10));//false



    }
}
