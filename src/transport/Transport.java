package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    protected final String brand;
    protected final String model;
    protected final double engineVolume;
    protected T driver;
    protected List<Mechanic> arrayOfMechanics;


    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> arrayOfMechanics) {
        if (brand == null || brand.isEmpty()){
            brand = "default";}
        this.brand = brand;

        if (model == null || model.isEmpty()) {
        model = "default";}
        this.model = model;

        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
        this.driver = driver;
        this.arrayOfMechanics = arrayOfMechanics;
    }

    public List<Mechanic> getArrayOfMechanics() {
        return arrayOfMechanics;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void bestCircleTime();
    public abstract void maxSpeed();
    public abstract void pitStop();
    public abstract Type getType();
    public abstract void printType();


    abstract boolean passDiagnostics() throws TransportTypeException;
    @Override
    public String toString() {
        return "Марка: " + brand + ", " +
                "Модель: " + model + ", " +
                "Объём двигателя: "  + engineVolume + ",";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && driver.equals(transport.driver) && arrayOfMechanics.equals(transport.arrayOfMechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, arrayOfMechanics);
    }
}
