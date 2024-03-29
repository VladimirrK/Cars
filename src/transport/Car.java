package transport;
import java.util.List;
import java.util.Objects;

public class Car extends Transport<DriverB> {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType, List<Mechanic> arrayOfMechanics) {
        super(brand, model, engineVolume, driver, arrayOfMechanics);
        this.setBodyType(bodyType);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving(){
        System.out.println("Автомобиль марки " + brand + " начал движение");
    }
    @Override
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

    @Override
    public Type getType() {
        return Type.CAR;
    }
    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getBodyType());
        }
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        return true;
    }

    public enum BodyType {
        SEDAN,
        HATCHBACK,
        COUPE,
        UNIVERSAL,
        SUV,
        CROSSOVER,
        PICKUP,
        VAN,
        MINIVAN;
    }

    @Override
    public String toString() {
        return super.toString() + " Тип кузова: " + bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return bodyType == car.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType);
    }
}