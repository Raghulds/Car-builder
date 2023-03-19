package builder;

import cars.CarType;
import components.*;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(Fuelmeter fuelmeter);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
