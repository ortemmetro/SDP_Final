package com.company;

public interface Publisher {
    void addSubscriptionToUser(User user);
    void removeSubscriptionFromUser(Observer user);
    void notifyAllUsers();
}
