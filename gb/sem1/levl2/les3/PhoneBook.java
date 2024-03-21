package gb.sem1.levl2.les3;

import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            phoneBook1.add(SortInHashMap.generateWord(1), random.nextInt(100));

        }
        System.out.println(phoneBook1.get("а"));

    }
    private final Map<String, Set<Integer>> phoneBook = new HashMap<>();


    public void add(String name,Integer numberPhone){
        Set<Integer> phone = phoneBook.getOrDefault(name,new HashSet<>());
        phone.add(numberPhone);
        phoneBook.put(name,phone);
    }

    public Set<Integer> get(String name){
        return phoneBook.get(name);
    }
}
