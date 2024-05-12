package d13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd HH:mm:ss yyyy");

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "FROM: " + sender +
                "\nTO: " + receiver +
                "\nON: " + date +
                "\nON: " + simpleDateFormat.format(text) +
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
