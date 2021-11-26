package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subscription implements Publisher{
    private List<User> users = new ArrayList<>();
    User user;

    public Subscription(ArrayList<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public void addSubscriptionToUser(User user) {
        this.user.setSubscriptionChecker(true);
    }

    @Override
    public void removeSubscriptionFromUser(Observer user) {
        this.user.setSubscriptionChecker(false);
    }

    @Override
    public void notifyAllUsers() {
        for(Observer user: this.users){
            user.update(this.users);
        }
    }
}
