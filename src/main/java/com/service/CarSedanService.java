package com.service;

import com.dao.CarDAOInterface;
import com.model.Car;
import com.model.CarSedan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 4oc3p on 18.05.2017. autoservice
 */
public class CarSedanService implements CarServiceInterface {

    private CarDAOInterface carDAO;

    public CarSedanService() {
    }

    public CarSedanService(CarDAOInterface carDAO) {
        this.carDAO = carDAO;
    }

    public CarDAOInterface getCarDAO() {
        return carDAO;
    }

    public void setCarDAO(CarDAOInterface carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        for (Car car : carDAO.getAllCars()) {
            if (car instanceof CarSedan) {
                cars.add((CarSedan) car);
            }
        }

        return cars;
    }
}
