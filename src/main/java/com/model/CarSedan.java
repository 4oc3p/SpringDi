package com.model;

/**
 * Created by 4oc3p on 18.05.2017. autoservice
 */
public class CarSedan extends Car {
    private int speed;

    public CarSedan(String model, int age, int speed) {
        super(model, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void carMove() {
        System.out.printf("%s moves with speed %d\n", getModel(), speed);
    }
}
