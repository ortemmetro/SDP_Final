package com.company;

public abstract class Car {
    private float engineVolume;
    private int maxSpeed;
    private String modelName;


    private DriveBehavior driveBehavior;
    private BibipBehavior bibipBehavior;

    public Car(float engineVolume, int maxSpeed, String modelName, DriveBehavior driveBehavior, BibipBehavior bibipBehavior) {
        this.engineVolume = engineVolume;
        this.maxSpeed = maxSpeed;
        this.modelName = modelName;
        this.driveBehavior = driveBehavior;
        this.bibipBehavior = bibipBehavior;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public BibipBehavior getBibipBehavior() {
        return bibipBehavior;
    }

    public void setBibipBehavior(BibipBehavior bibipBehavior) {
        this.bibipBehavior = bibipBehavior;
    }

    public void performDrive(){
        this.driveBehavior.drive();
    }

    public void performBibip(){
        this.bibipBehavior.bibip();
    }

    abstract void display();

    public DriveBehavior getDriveBehavior() {
        return driveBehavior;
    }

    public void setDriveBehavior(DriveBehavior driveBehavior) {
        this.driveBehavior = driveBehavior;
    }
}
