package com.company;

public class Mercedes extends Car{

    public Mercedes(float engineVolume, int maxSpeed, String modelName,
                    DriveBehavior driveBehavior,
                    BibipBehavior bibipBehavior) {
        super(engineVolume, maxSpeed, modelName, driveBehavior, bibipBehavior);
    }

    @Override
    void display() {
        System.out.println("I'm Mercedes!");
    }
}
