package transport;
public class DriverD extends Driver {
    public DriverD(String name, String hasDriverLicense, int experience) {
        super(name, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getName() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории D " + getName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории D " + getName() + " заправляет авто");
    }
}
