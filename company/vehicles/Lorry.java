package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private  int carrying;

    public Lorry(String carClass, String brend, Engine engine, Driver driver, int carrying) {
        super(carClass, brend, engine, driver);
        this.carrying = carrying;
    }
}
