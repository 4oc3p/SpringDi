package com.model;

/**
 * Created by 4oc3p on 18.05.2017. autoservice
 */
public class CarCargo extends Car {

    private int capacity;

    public CarCargo(String model, int age, int capacity) {
        super(model, age);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void carMove() {
        System.out.printf("%s moves, age - %d, capacity %d\n", getModel(), getAge(), capacity);
    }
}
