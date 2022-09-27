package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private double speed;

    public SportCar(String carClass, String brend, Engine engine, Driver driver) {
        super(carClass, brend, engine, driver);
    }
    
}
