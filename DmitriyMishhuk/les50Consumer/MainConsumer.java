package DmitriyMishhuk.les50Consumer;
public class MainConsumer {
    public static void main(String[] args) {
        Consumer consumer = (str) -> System.out.println("Its add consumer " +str);
        consumer.accept("123");
    }
}
