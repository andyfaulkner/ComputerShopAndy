package ProgramLogic;

/**
 * Created by student on 01-Jul-16.
 */
public class Desktop extends Computer {

    private int monitorSize;

    public Desktop(String computerName, String desciption, double cpuSpeed, int ram, int hardDriveCapacity, CPUType cpuType, double price, GraphicsCard graphicsCard, int monitorSize) {
        super(computerName, desciption, cpuSpeed, ram, hardDriveCapacity, cpuType, price, graphicsCard);
        this.monitorSize = monitorSize;
    }

    public int getMonitorSize() {
        return monitorSize;
    }
}
