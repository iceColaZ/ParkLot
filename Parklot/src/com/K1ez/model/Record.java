package com.K1ez.model;
//Driver, LotId, Entrytime, Entrydate, Color, CarId
public class Record {
    private String Driver;
    private int LotId;
    private String Entrytime;
    private String Entrydate;
    private String Color;
    private String CarId;

    public String getCarId() {
        return CarId;
    }

    public void setCarId(String carId) {
        CarId = carId;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getEntrydate() {
        return Entrydate;
    }

    public void setEntrydate(String entrydate) {
        Entrydate = entrydate;
    }

    public String getEntrytime() {
        return Entrytime;
    }

    public void setEntrytime(String entrytime) {
        Entrytime = entrytime;
    }

    public int getLotId() {
        return LotId;
    }

    public void setLotId(int lotId) {
        LotId = lotId;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }
}
