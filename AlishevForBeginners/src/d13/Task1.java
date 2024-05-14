package d13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("pavel");
        User user2 = new User("Marina");
        User user3 = new User("svetlana");
        MessageDatabase.sendMessage(user1,user2,"1-2-0");
        MessageDatabase.sendMessage(user1,user2,"1-2-1");
        MessageDatabase.sendMessage(user2,user1,"2-1-0");
        MessageDatabase.sendMessage(user1,user2,"1-2-2");
        MessageDatabase.sendMessage(user2,user1,"2-1-1");
        MessageDatabase.sendMessage(user2,user3,"2-3-1");
        MessageDatabase.sendMessage(user1,user3,"1-3-1");
        MessageDatabase.showDialog(user1,user2);
        MessageDatabase.showDialog(user2,user3);
    }
}
