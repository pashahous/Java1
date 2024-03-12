package JavaSelfeduOOP.l17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Dog dog = new Dog("Bob", 2);
        Dog dog1 = new Dog("Can", 3);
        dog.run();
        dog1.run();
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog tempDog;
        for (int i = 0; i < 10; i++) {
            tempDog = new Dog("\"name " + RandomString.giveMe("name")+ "\"", rnd.nextInt(4));
            tempDog.run();
        }

    }
}
