package transport;

import java.util.List;

public class Bus extends Transport<DriverD> {

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity, List<Mechanic> arrayOfMechanics) {
        super(brand, model, engineVolume, driver, arrayOfMechanics);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки " + brand + " начал движение");
    }

    @Override
    public void stopMoving() {
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

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getCapacity());
        }
    }
    @Override
    public boolean passDiagnostics() throws TransportTypeException {
            throw new TransportTypeException("Автобусы проходить диагностику не должны");
    }

    public enum Capacity {
        EXTRA_SMALL(1, 9),
        SMALL(10, 24),
        AVERAGE(25, 49),
        BIG(50, 79),
        EXTRA_BIG(80, 120);

        private int numberOfSeatsMin;
        private int numberOfSeatsMax;

        Capacity(int numberOfSeatsMin, int numberOfSeatsMax) {
            this.numberOfSeatsMin = numberOfSeatsMin;
            this.numberOfSeatsMax = numberOfSeatsMax;
        }

        public int getNumberOfSeatsMin() {
            return numberOfSeatsMin;
        }

        public int getNumberOfSeatsMax() {
            return numberOfSeatsMax;
        }

        public void setNumberOfSeatsMin(int numberOfSeatsMin) {
            this.numberOfSeatsMin = numberOfSeatsMin;
        }

        public void setNumberOfSeatsMax(int numberOfSeatsMax) {
            this.numberOfSeatsMax = numberOfSeatsMax;
        }

        public static Capacity NumberOfSeats(int value) {
            for (Capacity e : Capacity.values()) {
                if (value >= e.getNumberOfSeatsMin() && value <= e.getNumberOfSeatsMax()) {
                    return e;
                }
            }
            return null;
        }
        @Override
        public String toString() {
            return super.toString() + " " + numberOfSeatsMin + " - " + numberOfSeatsMax + " мест";
        }
    }
    @Override
    public String toString() {
        return super.toString() + " Тип вместимости: " + capacity;
    }
}