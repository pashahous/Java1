package DmitriyMishhuk.les50Consumer;

public interface Consumer<T> {

    default void accept(T t){
        System.out.println(t);
    }
}
