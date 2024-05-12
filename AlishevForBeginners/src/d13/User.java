package d13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }
    public void subscribe(User user){
        subscriptions.add(user);
    }
    public boolean isSubscribe(User user){
        return subscriptions.contains(user);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public boolean isFriend(User user){
     return user.isSubscribe(this) && subscriptions.contains(user);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    public void sendMessage(User user, String string){

    }
}
