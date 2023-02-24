package transport;
public class Car extends Transport<DriverB> {

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving(){
        System.out.println("Автомобиль марки " + brand + " начал движение");
    }

    public void stopMoving(){
        System.out.println("Автомобиль марки " + brand + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у легкового автомобиля");
    }

    @Override
    public void bestCircleTime() {
        double maxBound = 3.0;
        double minBound = 1.0;
        double bestTime = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Лучшее время круга у легкового автомобиля: " + bestTime + " мин");
    }

    @Override
    public void maxSpeed() {
        double maxBound = 300.0;
        double minBound = 80.0;
        double maxSpeed = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость для легкового автомобиля: " + maxSpeed + "км/ч");
    }
}