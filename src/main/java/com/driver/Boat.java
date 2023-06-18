package com.driver;

public class Boat implements WaterVehicle{
    Vehicle v = new Vehicle();

    @Override
    public String getVehicleName() {
        return v.getName();
    }

    @Override
    public int getVehicleCapacity() {
        return v.getCurrentSpeed();
    }
}
