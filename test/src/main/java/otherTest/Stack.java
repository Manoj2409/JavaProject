package otherTest;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }
    public void push(T newValue){
        stackList.add(newValue);
    }
    public T pop(){
        return stackList.remove(stackList.size()-1);
    }

    // WRITE PUSH METHOD HERE //
    //                        //
    //                        //
    //                        //
    ////////////////////////////

}