package com.company;

public class UnpleasantDrive implements DriveBehavior{
    @Override
    public void drive() {
        System.out.println("This drive is so bad, I can't handle it!");
    }
}
