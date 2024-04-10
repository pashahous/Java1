package programming.tree;

import java.util.ArrayList;
import java.util.List;

public class SimpleStack<T> {
    //LIFO
    List<T> stackList;

    public SimpleStack() {
        this.stackList = new ArrayList<>();
    }

    public T pop() {
        return stackList.remove(stackList.size() - 1);
    }
    public void push(T item) {
        stackList.add(0,item);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int size(){
        return stackList.size();
    }
}
