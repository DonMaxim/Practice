package Task02;

public class IoTDevice {
    private String id;
    private String name;
    public IoTDevice(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        SmartLight alisa = new SmartLight("1", "Alisa", true);
        SmartThermostat elon = new SmartThermostat("2", "Elon", 22);
        alisa.performAction();
        elon.performAction();
        elon.setTemperature(25);
        elon.performAction();
    }
    public void performAction() {
        System.out.println("Performing action for device: " + name);
    }
}
