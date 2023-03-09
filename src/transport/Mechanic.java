package transport;

import java.util.ArrayList;
import java.util.List;
public class Mechanic {

    private String nameSurname;
    private String workCompany;

    public Mechanic(String nameSurname, String workCompany) {
        this.nameSurname = nameSurname;
        this.workCompany = workCompany;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }

    public static void conductMaintenance() {
        System.out.print("Техническое обслуживание пройдено, ");
    }

    public static void fixTheCar() {
        System.out.println("автомобиль отремонтирован");
    }
}
