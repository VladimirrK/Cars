package transport;

public class Trucks extends Transport<DriverC> {

    public Trucks(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик марки " + brand + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик марки " + brand + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузового автомобиля");
    }

    @Override
    public void bestCircleTime() {
        double maxBound = 10.0;
        double minBound = 5.0;
        double bestTime = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Лучшее время круга у грузового автомобиля: " + bestTime + " мин");
    }

    @Override
    public void maxSpeed() {
        double maxBound = 100.0;
        double minBound = 50.0;
        double maxSpeed = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость для грузового автомобиля: " + maxSpeed + "км/ч");
    }
}
