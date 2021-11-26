package com.company;

public class Toyota extends Car{
    public Toyota(float engineVolume, int maxSpeed, String modelName,
                    DriveBehavior driveBehavior,
                    BibipBehavior bibipBehavior) {
        super(engineVolume, maxSpeed, modelName, driveBehavior, bibipBehavior);
    }

    @Override
    void display() {
        System.out.println("I'm Toyota!");
    }
}
