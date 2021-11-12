package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    @Override
    public void fly() {

    }

    int passengerCount;
    public Plane (int passengerCount) {
        this.passengerCount = passengerCount;
    }
}
