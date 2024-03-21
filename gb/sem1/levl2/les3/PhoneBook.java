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
    private final Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();


    public void add(String name,Integer numberPhone){
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>(Collections.singletonList(numberPhone)));
            System.out.println("Create new string "+name+" "+ phoneBook.get(name)  );
        } else {
            ArrayList<Integer> phonesToAdd = phoneBook.get(name);
            phonesToAdd.add(numberPhone);
            phoneBook.put(name, phonesToAdd);
            System.out.println("after add \"" + name+"\""+ phoneBook.get(name) );
        }


    }

    public ArrayList<Integer> get(String name){
        return phoneBook.get(name);
    }
}
