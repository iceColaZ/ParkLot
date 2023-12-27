package com.K1ez.model;

public class CarInf {
    private String CarId;
    private String Color;
    private String Driver;
    private int Lotid;

    public int getLotid() {
        return Lotid;
    }

    public void setLotid(int lotid) {
        Lotid = lotid;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getCarId() {
        return CarId;
    }

    public void setCarId(String carId) {
        CarId = carId;
    }
}
