package ProgramLogic;

/**
 * Created by student on 01-Jul-16.
 */
public class Laptop extends Computer {

    private int batteryLife;
    private int screenSize;
    private double weight;

    public Laptop(String computerName, String desciption, double cpuSpeed, int ram, int hardDriveCapacity, CPUType cpuType, double price, GraphicsCard graphicsCard, int batteryLife, int screenSize, double weight) {
        super(computerName, desciption, cpuSpeed, ram, hardDriveCapacity, cpuType, price, graphicsCard);
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
        this.weight = weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public double getWeight() {
        return weight;
    }

}
