package transport;
public class DriverB extends Driver {
    public DriverB(String name, String hasDriverLicense, int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории B " + getName() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории B " + getName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории B " + getName() + " заправляет авто");
    }
}
