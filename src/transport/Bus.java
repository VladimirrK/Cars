package transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving(){
        System.out.println("Автобус марки " + brand + " начал движение");
    }

    public void stopMoving(){
        System.out.println("Автобус марки " + brand + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void bestCircleTime() {
        double maxBound = 10.0;
        double minBound = 5.0;
        double bestTime = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Лучшее время круга у автобуса: " + bestTime + " мин");
    }

    @Override
    public void maxSpeed() {
        double maxBound = 120.0;
        double minBound = 40.0;
        double maxSpeed = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость для автобуса: " + maxSpeed + "км/ч");
    }
}