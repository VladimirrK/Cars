package transport;

public class Bus extends Transport {

    public Bus (String brand, String model, String color, int year, String country, int maxSpeed){
        super (brand, model, color, year, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "\n" + getBrand() + " " + getModel() + ", "
                + getYear() + " года выпуска, сборка: " + getCountry() + ", "
                +  getColor() + " цвет кузова, максимальная скорость: " + getMaxSpeed() + "км/ч," + "\n";
    }
}
