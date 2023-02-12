package transport;

public class CarList {
    public static void main(String[] args) {
        Car Lada = new Car ("Lada", "Granta", 1.7, "желтый", 2015,
                "Россия", "механика", "седан", "К123КК174", 5,
                160, new Car.Key(false, false));
        System.out.println(Lada);

        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,"черный", 2020,
                "Германия", "автомат", "седан", "Т555ТТ999", 5,
                220, new Car.Key(true, true));
        System.out.println(Audi);

        Car BMW = new Car("BMW", "Z8", 3.0,"черный", 2021,
                "Германия", "автомат", "родстер", "В666ВВ777", 2,
                280, new Car.Key(true, true));
        System.out.println(BMW);

        Car Kia = new Car("Kia", "Sportage 4", 2.4,"красный", 2018,
                "Южная Корея", "механика", "внедорожник", "М333ММ074", 5,
                180, new Car.Key(true, false));
        System.out.println(Kia);

        Car Hyundai = new Car("Hyundai", "Avante", 1.6,"оранжевый", 2016,
                "Южная Корея", "автомат", "седан", "В945НН174", 5,
                210, new Car.Key(true, false));
        System.out.println(Hyundai);

        Bus Scania = new Bus("Scania", "Touring 6X2", "белый",
                2021, "Швеция", 120);
        System.out.println(Scania);

        Bus Liaz = new Bus("ЛИАЗ", "5292 рестайлинг", "синий",
                2020, "Россия", 80);
        System.out.println(Liaz);

        Bus busHyundai = new Bus("Hyundai", "Aero Express", "серый",
                2000, "Южная Корея", 120);
        System.out.println(busHyundai);
    }
}
