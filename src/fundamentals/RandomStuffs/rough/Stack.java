package fundamentals.RandomStuffs.rough;
import java.util.ArrayList;

public class Stack<T> {  // Renamed to avoid confusion
    private ArrayList<T> stackList = new ArrayList<>();

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stackList.get(stackList.size() - 1);
    }

    public int size() {
        return stackList.size();
    }

    public void push(T value) {
        stackList.add(value);
    }

    public T pop() {
        if (isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }
}
