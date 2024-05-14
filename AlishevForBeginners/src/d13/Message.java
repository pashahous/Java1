package d13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private static long id;
    private User sender;
    private User receiver;
    private String text;
    private LocalDateTime date;
    private static final String dateFormat = "dd-HH:mm:s";

    public Message(User sender, User receiver, String text) {
        id += 1;
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = LocalDateTime.now().plusSeconds(id);
    }

    @Override
    public String toString() {
        return "FROM: " + sender +
                "\nTO: " + receiver +
                "\nON: " + date.format(DateTimeFormatter.ofPattern(dateFormat)) +
                "\nTEXT: " + text;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
