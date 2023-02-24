package transport;

public class CarList {
    public static void main(String[] args) {

            DriverB driver1 = new DriverB("Вася", "B", 5);
            DriverB driver2 = new DriverB("Петя", "B", 4);
            DriverB driver3 = new DriverB("Игорь", "B", 3);
            DriverB driver4 = new DriverB("Дима", "B", 8);

            Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, driver1, Car.BodyType.SEDAN);
            System.out.println("водитель " + driver1 + " управляет автомобилем " + Audi + ", будет участвовать в заезде");

            Car BMW = new Car("BMW", "Z8", 3.0, driver2, Car.BodyType.COUPE);
            System.out.println("водитель " + driver2 + " управляет автомобилем " + BMW + ", будет участвовать в заезде");

            Car Kia = new Car("Kia", "Sportage 4", 2.4, driver3, Car.BodyType.CROSSOVER);
            System.out.println("водитель " + driver3 + " управляет автомобилем " + Kia + ", будет участвовать в заезде");

            Car Hyundai = new Car("Hyundai", "Avante", 1.6, driver4, Car.BodyType.SEDAN);
            System.out.println("водитель " + driver4 + " управляет автомобилем " + Hyundai + ", будет участвовать в заезде");



            DriverD driver5 = new DriverD("Гена", "D", 6);
            DriverD driver6 = new DriverD("Юра", "D", 5);
            DriverD driver7 = new DriverD("Никита", "D", 9);
            DriverD driver8 = new DriverD("Рома", "D", 4);

            System.out.println();
            System.out.println("Автобусы");
            Bus Scania = new Bus("Scania", "Touring 6X2", 6.2, driver5, Bus.Capacity.NumberOfSeats(57));
            System.out.println("водитель " + driver5 + " управляет автомобилем " + Scania + ", будет участвовать в заезде");

            Bus Liaz = new Bus("ЛИАЗ", "5292 рестайлинг", 4.2, driver6, Bus.Capacity.NumberOfSeats(114));
            System.out.println("водитель " + driver6 + " управляет автомобилем " + Liaz + ", будет участвовать в заезде");

            Bus busHyundai = new Bus("Hyundai", "Aero Express", 4.0, driver7, Bus.Capacity.NumberOfSeats(45));
            System.out.println("водитель " + driver7 + " управляет автомобилем " + busHyundai + ", будет участвовать в заезде");

            Bus Mercedes = new Bus("Mercedes-Benz", "Sprinter", 2.2, driver8, Bus.Capacity.NumberOfSeats(16));
            System.out.println("водитель " + driver8 + " управляет автомобилем " + Mercedes + ", будет участвовать в заезде");



            DriverC driver9 = new DriverC("Денис", "C", 9);
            DriverC driver10 = new DriverC("Лена", "C", 7);
            DriverC driver11 = new DriverC("Юля", "C", 6);
            DriverC driver12 = new DriverC("Оля", "C", 3);

            System.out.println();
            System.out.println("Грузовые автомобили");
            Trucks truckHyundai = new Trucks("Hyundai", "Mighty", 2.9, driver9, Trucks.Weight.loadCapacity(2.8f));
            System.out.println("водитель " + driver9 + " управляет автомобилем " + truckHyundai + ", будет участвовать в заезде");

            Trucks Ural = new Trucks("Урал", "Next", 11.2, driver10, Trucks.Weight.loadCapacity(22.5f));
            System.out.println("водитель " + driver10 + " управляет автомобилем " + Ural + ", будет участвовать в заезде");

            Trucks Daewoo = new Trucks("Daewoo", "Novus", 5.9, driver11, Trucks.Weight.loadCapacity(12.8f));
            System.out.println("водитель " + driver11 + " управляет автомобилем " + Daewoo + ", будет участвовать в заезде");

            Trucks Howo = new Trucks("Howo", "T5G", 10.5, driver12, Trucks.Weight.loadCapacity(32f));
            System.out.println("водитель " + driver12 + " управляет автомобилем " + Howo + ", будет участвовать в заезде");
    }
}
