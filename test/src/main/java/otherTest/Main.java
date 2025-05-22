package otherTest;
public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        String some="who";
        System.out.println(revString(some));
    }

    public static String revString(String some){
        StringBuilder stringBuilder=new StringBuilder(some);
        return stringBuilder.reverse().toString();
    }
}