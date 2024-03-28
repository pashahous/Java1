package gb.sem1.levl3.les3;

import java.util.ArrayList;

public class BoxFruit<T extends BoxFruit> {
    private ArrayList<T> fruits;

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public BoxFruit(ArrayList<T> box) {
        this.fruits = box;
    }

    public BoxFruit() {
        fruits = new ArrayList<>();
    }

    public Float getWeight() {
        float weight=0;
        for (BoxFruit<T> t : fruits) {
            weight += t.getWeight();
        }

        return weight;
    }

    public void addFruit(BoxFruit<T> t){
        fruits.add((T) t);
    }

    public boolean compare(BoxFruit<T> box ){
        return Math.abs(this.getWeight() - box.getWeight())< 0.001;
    }

    public void pour(BoxFruit<T> box){
        if (this.getClass() instanceof box.getClass()){

        }
    }
}
