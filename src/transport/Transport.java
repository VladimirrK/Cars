package transport;
public abstract class Transport<T extends Driver> implements Competing {
    protected final String brand;
    protected final String model;
    protected final double engineVolume;
    protected T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {
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

    @Override
    public String toString() {
        return "Марка: " + brand + ", " +
                "Модель: " + model + ", " +
                "Объём двигателя: "  + engineVolume + ",";
    }
}
