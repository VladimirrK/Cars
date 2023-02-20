package transport;
public class DriverC extends Driver {
    public DriverC(String name, String hasDriverLicense, int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C " + getName() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории C " + getName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории C " + getName() + " заправляет авто");
    }
}
