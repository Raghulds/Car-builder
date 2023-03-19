package cars;

import components.Engine;
import components.Fuelmeter;
import components.GPSNavigator;
import components.Transmission;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Fuelmeter fuelmeter;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               Fuelmeter fuelmeter, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.fuelmeter = fuelmeter;
        if (this.fuelmeter != null) {
            this.fuelmeter.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Fuelmeter getTripComputer() {
        return fuelmeter;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
