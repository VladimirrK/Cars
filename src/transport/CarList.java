package transport;

import java.sql.SQLOutput;
import java.util.*;

public class CarList {

        public static void main(String[] args) {

                ServiceStation serviceStation = new ServiceStation();

                DriverB driver1 = new DriverB("Вася", "B", 5);
                DriverB driver2 = new DriverB("Петя", "B", 4);
                DriverB driver3 = new DriverB("Игорь", "B", 3);
                DriverB driver4 = new DriverB("Дима", "B", 8);

                Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, driver1,
                        Car.BodyType.SEDAN, List.of(new Mechanic("Петор Петров", "Ремонт Мастер")));
                System.out.println("водитель " + driver1 + " управляет автомобилем " + audi + ", будет участвовать в заезде");
                serviceStation.addTransportToQueue(audi);
                Mechanic.conductMaintenance();
                Mechanic.fixTheCar();
                endDiagnostics(audi);

                Car bmw = new Car("BMW", "Z8", 3.0, driver2,
                        Car.BodyType.COUPE, List.of(new Mechanic("Василий Васильев", "Ремонт Мастер")));
                System.out.println("водитель " + driver2 + " управляет автомобилем " + bmw + ", будет участвовать в заезде");
                serviceStation.addTransportToQueue(bmw);
                Mechanic.conductMaintenance();
                Mechanic.fixTheCar();
                endDiagnostics(bmw);

                Car kia = new Car("Kia", "Sportage 4", 2.4, driver3,
                        Car.BodyType.CROSSOVER, List.of(new Mechanic("Игорь Крюк", "Эксперт")));
                System.out.println("водитель " + driver3 + " управляет автомобилем " + kia + ", будет участвовать в заезде");
                serviceStation.addTransportToQueue(kia);
                Mechanic.conductMaintenance();
                Mechanic.fixTheCar();
                endDiagnostics(kia);

                Car hyundai = new Car("Hyundai", "Avante", 1.6, driver4,
                        Car.BodyType.SEDAN, List.of(new Mechanic("Дмитрий Промкин", "Эксперт")));
                System.out.println("водитель " + driver4 + " управляет автомобилем " + hyundai + ", будет участвовать в заезде");
                serviceStation.addTransportToQueue(hyundai);
                Mechanic.conductMaintenance();
                Mechanic.fixTheCar();
                endDiagnostics(hyundai);

                DriverD driver5 = new DriverD("Гена", "D", 6);
                DriverD driver6 = new DriverD("Юра", "D", 5);
                DriverD driver7 = new DriverD("Никита", "D", 9);
                DriverD driver8 = new DriverD("Рома", "D", 4);

                System.out.println();
                System.out.println("Автобусы");

                Bus scania = new Bus("Scania", "Touring 6X2", 6.2, driver5,
                        Bus.Capacity.NumberOfSeats(57), List.of(new Mechanic("Петор Петров", "Ремонт Мастер")));
                System.out.println("водитель " + driver5 + " управляет автомобилем " + scania + ", будет участвовать в заезде");
                endDiagnostics(scania);

                Bus liaz = new Bus("ЛИАЗ", "5292 рестайлинг", 4.2, driver6,
                        Bus.Capacity.NumberOfSeats(114), List.of(new Mechanic("Петор Петров", "Ремонт Мастер")));
                System.out.println("водитель " + driver6 + " управляет автомобилем " + liaz + ", будет участвовать в заезде");
                endDiagnostics(liaz);

                Bus busHyundai = new Bus("Hyundai", "Aero Express", 4.0, driver7,
                        Bus.Capacity.NumberOfSeats(45), List.of(new Mechanic("Василий Васильев", "Ремонт Мастер")));
                System.out.println("водитель " + driver7 + " управляет автомобилем " + busHyundai + ", будет участвовать в заезде");
                endDiagnostics(busHyundai);

                Bus mercedes = new Bus("Mercedes-Benz", "Sprinter", 2.2, driver8,
                        Bus.Capacity.NumberOfSeats(16), List.of(new Mechanic("Василий Васильев", "Ремонт Мастер")));
                System.out.println("водитель " + driver8 + " управляет автомобилем " + mercedes + ", будет участвовать в заезде");
                endDiagnostics(mercedes);


                DriverC driver9 = new DriverC("Денис", "C", 9);
                DriverC driver10 = new DriverC("Лена", "C", 7);
                DriverC driver11 = new DriverC("Юля", "C", 6);
                DriverC driver12 = new DriverC("Оля", "C", 3);

                System.out.println();
                System.out.println("Грузовые автомобили");

                Trucks truckHyundai = new Trucks("Hyundai", "Mighty", 2.9, driver9,
                        Trucks.Weight.loadCapacity(2.8f), List.of(new Mechanic("Игорь Крюк", "Эксперт")));
                System.out.println("водитель " + driver9 + " управляет автомобилем " + truckHyundai + ", будет участвовать в заезде");
                serviceStation.addTransportToQueue(truckHyundai);
                Mechanic.conductMaintenance();
                Mechanic.fixTheCar();
                endDiagnostics(truckHyundai);

                Trucks ural = new Trucks("Урал", "Next", 11.2, driver10,
                        Trucks.Weight.loadCapacity(22.5f), List.of(new Mechanic("Игорь Крюк", "Эксперт")));
                System.out.println("водитель " + driver10 + " управляет автомобилем " + ural + ", будет участвовать в заезде");
                serviceStation.addTransportToQueue(ural);
                Mechanic.conductMaintenance();
                Mechanic.fixTheCar();
                endDiagnostics(ural);

                Trucks daewoo = new Trucks("Daewoo", "Novus", 5.9, driver11,
                        Trucks.Weight.loadCapacity(12.8f), List.of(new Mechanic("Игорь Крюк", "Эксперт")));
                System.out.println("водитель " + driver11 + " управляет автомобилем " + daewoo + ", будет участвовать в заезде");
                serviceStation.addTransportToQueue(daewoo);
                Mechanic.conductMaintenance();
                Mechanic.fixTheCar();
                endDiagnostics(daewoo);

                Trucks howo = new Trucks("Howo", "T5G", 10.5, driver12,
                        Trucks.Weight.loadCapacity(32f), List.of(new Mechanic("Игорь Крюк", "Эксперт")));
                System.out.println("водитель " + driver12 + " управляет автомобилем " + howo + ", будет участвовать в заезде");
                serviceStation.addTransportToQueue(howo);
                Mechanic.conductMaintenance();
                Mechanic.fixTheCar();
                endDiagnostics(howo);


                ArrayList<Transport<?>> transports = new ArrayList<>(12);
                transports.add(audi);
                transports.add(bmw);
                transports.add(kia);
                transports.add(hyundai);
                transports.add(scania);
                transports.add(liaz);
                transports.add(busHyundai);
                transports.add(mercedes);
                transports.add(truckHyundai);
                transports.add(ural);
                transports.add(daewoo);
                transports.add(howo);

                List<Driver> drivers = new ArrayList<>();
                drivers.add(driver1);
                drivers.add(driver2);
                drivers.add(driver3);
                drivers.add(driver4);
                drivers.add(driver5);
                drivers.add(driver6);
                drivers.add(driver7);
                drivers.add(driver8);
                drivers.add(driver9);
                drivers.add(driver10);
                drivers.add(driver11);
                drivers.add(driver12);


                Map<Transport<?>, List<Mechanic>> map = new HashMap<>();
                for (Transport<?> transport : transports) {
                        map.put(transport, transport.getArrayOfMechanics());
                }

                Set<Driver> driverSet = new HashSet<>();
                for (Driver driver : drivers) {
                        driverSet.add(driver);
                }

                Iterator<Driver> iterator = driverSet.iterator();
                while (iterator.hasNext()) {
                        Driver driver = iterator.next();
                        System.out.println(driver);
                }
        }


        public static void endDiagnostics(Transport<?>... transports) {
                for (Transport<?> transport : transports) {
                        try {
                                transport.passDiagnostics();
                        } catch (TransportTypeException e) {
                                System.out.println(e.getMessage());
                        }
                }
        }
}