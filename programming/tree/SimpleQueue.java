package programming.tree;

import java.util.ArrayList;
import java.util.List;

public class SimpleQueue<T> {
    //FIFO
    List<T> listQueue;


    public SimpleQueue() {
        listQueue = new ArrayList<T>();
    }

    public void push(T item) {
        listQueue.add(0, item);
    }

    public T pop() {
        return listQueue.remove(0);
    }

    public boolean isEmpty(){
        return listQueue.isEmpty();
    }

}
