package transport;

public abstract class Driver {
    private String name;
    private String hasDriverLicense;
    private int experience;

    public Driver(String name, String hasDriverLicense, int experience) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getHasDriverLicense() {
        return hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "" + name + ", категоря прав: " + hasDriverLicense + ", стаж вождения: " + experience + " лет ";
    }

    public abstract void startMove();
    public abstract void stopMove();
    public abstract void refill();
}
