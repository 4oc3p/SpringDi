package com.dao;

import com.model.Car;
import com.model.CarCargo;
import com.model.CarSedan;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 4oc3p on 18.05.2017. autoservice
 */
public class CarDAOImplement implements CarDAOInterface {
    private List<Car> cars = Arrays.asList(
            new CarSedan("Mazda", 11, 100),
            new CarSedan("Opel", 25, 88),
            new CarCargo("Man", 16, 2000)
    );

    @Override
    public List<Car> getAllCars(){
        return cars;
    }
}
