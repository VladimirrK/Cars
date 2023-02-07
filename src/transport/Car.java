package transport;

import static transport.ValidateUtil.*;


public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String number;
    private final int numberOfSeats;
    private boolean isSummerRubber;
    private Key key;


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String number, int numberOfSeats, Key key) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateCarColor(color);
        this.year = validateCarYear(year);
        this.country = validateCarParameters(country);
        this.transmission = validateCarParameters(transmission);
        this.bodyType = validateCarParameters(bodyType);
        this.number = validateCarNumber(number);
        this.numberOfSeats = validateCarNumberOfSeats(numberOfSeats);
        setKey(key);
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

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public static String validateCarParameters(String value) {
        return validateString(value, "default");
    }

    public static double validateEngineVolume(double value) {
        return validateEngine(value, 1.5);
    }

    public static String validateCarColor(String value) {
        return validateColor(value, "белый");
    }

    public static Integer validateCarYear(Integer value) {
        return validateYear(value, 2000);
    }

    public static Integer validateCarNumberOfSeats(Integer value) {
        return validateNumberOfSeats(value, 5);
    }

    public static String validateCarNumber(String value) {
        return validateNumber(value, "Некорректный номер");
    }

    public void changeTyres(int month) {
        if ((month >= 10 && month <= 12) || (month >= 1 && month <= 3)) {
            isSummerRubber = false;
        }
        if (month >=4 && month <= 9) {
            isSummerRubber = true;
        }
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "удалённый запуск двигателя" : "без удалённого запуска двигателя") + ", " +
                    (keylessEntry ? "бесключевой доступ" : "бесключевой доступ отсутсвует");
        }
    }


    @Override
    public String toString() {
        return "\n" + brand + " " + model + ", "
                + year + " года выпуска, сборка: " + country + ", "
                +  color + " цвет кузова, объём двигателя: " + engineVolume +"л, коробка передач: "
                + transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " + number +
                ", Количество мест: " + numberOfSeats + ", " + key + "\n";
    }
}