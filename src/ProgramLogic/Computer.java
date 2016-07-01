package ProgramLogic;

/**
 * Created by student on 01-Jul-16.
 */
public class Computer {

    private String computerName;
    private String desciption;
    private double cpuSpeed;
    private int ram;
    private int hardDriveCapacity;
    CPUType cpuType;
    private double price;
    GraphicsCard graphicsCard;

    public Computer(String computerName, String desciption, double cpuSpeed, int ram, int hardDriveCapacity, CPUType cpuType, double price, GraphicsCard graphicsCard) {
        this.computerName = computerName;
        this.desciption = desciption;
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.hardDriveCapacity = hardDriveCapacity;
        this.cpuType = cpuType;
        this.price = price;
        this.graphicsCard = graphicsCard;
    }

    public String getComputerName() {
        return computerName;
    }

    public String getDesciption() {
        return desciption;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public CPUType getCpuType() {
        return cpuType;
    }

    public double getPrice() {
        return price;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }
}
