package JavaSelfeduOOP.l17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Random rnd = new Random();
//        Dog dog = new Dog("Bob", 2);
//        Dog dog1 = new Dog("Can", 3);
//        dog.run();
//        dog1.run();
//        ArrayList<Dog> dogs = new ArrayList<>();
//        Dog tempDog;
//        for (int i = 0; i < 10; i++) {
//            tempDog = new Dog("\"name " + RandomString.giveMe("name")+ "\"", rnd.nextInt(4));
//            tempDog.run();
//        }
        List<MusicalInstrumentsPropertys> instrumentsPropertys = new ArrayList<>();

       instrumentsPropertys.add( new MusicalInstrumentsPropertys("Gutar",
                1,new Dimension(100,100,100)));

       instrumentsPropertys.add( new MusicalInstrumentsPropertys("Gutar",
                1,new Dimension(100,100,100)));

       instrumentsPropertys.add( new MusicalInstrumentsPropertys("Arfa",
                2,new Dimension(100,100,100)));

       instrumentsPropertys.add( new MusicalInstrumentsPropertys("Arfa",
                2,new Dimension(1,100,100)));

       instrumentsPropertys.stream().forEach(inst-> System.out.println(inst));

      MusicalInstrumentsPropertys.Stats.stats.values().forEach(System.out::println);

    }
}
