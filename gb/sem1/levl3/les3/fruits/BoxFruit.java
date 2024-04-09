package gb.sem1.levl3.les3.fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxFruit<T extends BoxFruit> {
    private List<T> container;

    public BoxFruit(T...fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public BoxFruit() {
        container = new ArrayList<>();
    }

    public void setContainer(ArrayList<T> container) {
        this.container = container;
    }

    public Float getWeight() {
        float weight=0.0f;
        for (BoxFruit<T> t : container) {
            weight += t.getWeight();
        }

        return weight;
    }

    public void addFruit(T fruit){
        container.add(fruit);
    }

    public boolean compare(BoxFruit<T> box ){
        return Math.abs(this.getWeight() - box.getWeight())< 0.001;
    }

    public void transfer(BoxFruit<? super T> another){
        if (this == another){
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }
}
