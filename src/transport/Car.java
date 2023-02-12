package transport;

import static transport.ValidateUtil.*;


public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String number;
    private final int numberOfSeats;
    private boolean isSummerRubber;
    private Key key;


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String number, int numberOfSeats, int maxSpeed, Key key) {
        super(brand, model, color, year, country, maxSpeed);

        this.engineVolume = validateEngineVolume(engineVolume);
        this.transmission = validateCarParameters(transmission);
        this.bodyType = validateCarParameters(bodyType);
        this.number = validateCarNumber(number);
        this.numberOfSeats = validateCarNumberOfSeats(numberOfSeats);
        setKey(key);
    }


    public double getEngineVolume() {
        return engineVolume;
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
        return "\n" + getBrand() + " " + getModel() + ", "
                + getYear() + " года выпуска, сборка: " + getCountry() + ", "
                +  getColor() + " цвет кузова, объём двигателя: " + engineVolume +"л, коробка передач: "
                + transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " + number +
                ", Количество мест: " + numberOfSeats + ", максимальная скорость: " + getMaxSpeed() + "км/ч, "+ key + "\n";
    }
}