package ProgramLogic;

/**
 * Created by student on 01-Jul-16.
 */
public class Customer extends Person {

    private boolean laptop;
    private int weight;
    private int batteryLife;
    private int monitorSize;

    public Customer(String firstName, String lastName, String phoneNumber, String email, boolean laptop, int weight, int batteryLife, int monitorSize) {
        super(firstName, lastName, phoneNumber, email);
        this.laptop = laptop;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.monitorSize = monitorSize;
    }

    public boolean isLaptop() {
        return laptop;
    }

    public int getWeight() {
        return weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public int getMonitorSize() {
        return monitorSize;
    }

}
