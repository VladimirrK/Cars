package transport;

public class CarList {
    public static void main(String[] args) {
        Car Lada = new Car ("Lada", "Granta", 1.7, "желтый", 2015,
                "Россия", "механика", "седан", "К123КК174", 5,
                new Car.Key(false, false));

        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,"черный", 2020,
                "Германия", "автомат", "седан", "Т555ТТ999", 5,
                new Car.Key(true, true));

        Car BMW = new Car("BMW", "Z8", 3.0,"черный", 2021,
                "Германия", "автомат", "родстер", "В666ВВ777", 2,
                new Car.Key(true, true));

        Car Kia = new Car("Kia", "Sportage 4", 2.4,"красный", 2018,
                "Южная Корея", "механика", "внедорожник", "М333ММ074", 5,
                new Car.Key(true, false));

        Car Hyundai = new Car("Hyundai", "Avante", 1.6,"оранжевый", 2016,
                "Южная Корея", "автомат", "седан", "В945НН174", 5,
                new Car.Key(true, false));


        System.out.println(Lada + "" + Audi + "" + BMW + "" + Kia + "" + Hyundai);
    }
}
