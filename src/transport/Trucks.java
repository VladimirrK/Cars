package transport;

import java.util.List;
import java.util.Objects;

public class Trucks extends Transport<DriverC> {

    private Weight weight;

    public Trucks(String brand, String model, double engineVolume, DriverC driver, Weight weight, List<Mechanic> arrayOfMechanics) {
        super(brand, model, engineVolume, driver, arrayOfMechanics);
        this.weight = weight;
    }



    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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

    @Override
    public Type getType() {
        return Type.TRUCKS;
    }
    @Override
    public void printType() {
        if (getWeight() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getWeight());
        }
    }

    public enum Weight {
        N1(0.0f, 3.50f),
        N2(3.51f, 12f),
        N3(12.1f, 500f);

        private float minWeight;
        private float maxWeight;

        Weight(float minWeight, float maxWeight) {
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }

        public float getMinWeight() {
            return minWeight;
        }

        public float getMaxWeight() {
            return maxWeight;
        }

        public void setMinWeight(float minWeight) {
            this.minWeight = minWeight;
        }

        public void setMaxWeight(float maxWeight) {
            this.maxWeight = maxWeight;
        }

        public static Weight loadCapacity(float value) {
            for (Weight e : Weight.values()) {
                if (value >= e.getMinWeight() && value <= e.getMaxWeight()) {
                    return e;
                }
            }
            return null;
        }
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " Тип грузоподъёмности: " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trucks trucks = (Trucks) o;
        return weight == trucks.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }
}
