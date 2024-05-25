package Task02;

public class IoTDevice {
    private String id;
    String name;
    public IoTDevice(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void performAction() {
        System.out.println("Performing action for device: " + name);
    }
}
