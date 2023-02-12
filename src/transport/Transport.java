package transport;
import static transport.ValidateUtil.*;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;


    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {

        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.color = validateCarColor(color);
        this.year = validateCarYear(year);
        this.country = validateCarParameters(country);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public static String validateCarColor(String value) {
        return validateColor(value, "белый");
    }

    public static Integer validateCarYear(Integer value) {
        return validateYear(value, 2000);
    }

    public static String validateCarParameters(String value) {
        return validateString(value, "default");
    }
    public static Integer validateMaxSpeed(Integer value) {
        return  validateSpeed(value, 60);
    }
}
