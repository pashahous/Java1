package d13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MessageDatabase {
    private static final List<Message> messageList = new ArrayList<>();

    private MessageDatabase() {
    }

    public static void sendMessage(User u1, User u2, String msg) {
        messageList.add(new Message(u1, u2, msg));

    }

    public static List<Message> getMessage() {
        return messageList;
    }

    public static void showDialog(User u1, User u2) {
        List<Message> dialogList = new ArrayList<>();
        for (Message m : messageList) {
            if (u1.getUsername().equals(m.getSender().getUsername()) &&
                    u2.getUsername().equals(m.getReceiver().getUsername()) ||
                    u2.getUsername().equals(m.getSender().getUsername()) &&
                            u1.getUsername().equals(m.getReceiver().getUsername())) {

                dialogList.add(m);
            }
        }
        System.out.println("----------DIALOG LIST------------");
        for (Message m : dialogList) {
            System.out.printf("%s: %s \n", m.getSender().getUsername(), m.getText());

        }


    }
}