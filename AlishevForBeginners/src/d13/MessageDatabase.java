package d13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messageList = new ArrayList<>();

    private MessageDatabase() {
    }

    public static void sendMessage(User u1, User u2, String msg) {

    }

    public static List<Message> getMessage() {
        return messageList;
    }

public static void showDialog(User u1, User u2) {
        StringBuilder history = new StringBuilder(200);

        for (Message message : messageList) {
            if(message.getSender().equals(u1)){
                u1ToU2.add(message.getText());
                continue;
            }
            if (message.getSender().equals(u2)){
                u2ToU1.add(message.getText());
            }
        }




    }
}
