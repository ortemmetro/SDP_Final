package com.company;

import java.util.List;

public class User implements Observer{
    public User(String name, boolean subscriptionChecker) {
        this.name = name;
        SubscriptionChecker = subscriptionChecker;
    }

    private String name;
    private boolean SubscriptionChecker;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubscriptionChecker() {
        return SubscriptionChecker;
    }

    public void setSubscriptionChecker(boolean subscriptionChecker) {
        SubscriptionChecker = subscriptionChecker;
    }

    @Override
    public void update(List<User> users) {
        if(SubscriptionChecker == true) {
            System.out.println("Hello, " + this.name + ". Your subscription activated successfully!\n");
        } else{
            System.out.println("Hello, " + this.name + ". Your subscription has ended!\n");
        }
    }
}
