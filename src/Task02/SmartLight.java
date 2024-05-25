package Task02;

public class SmartLight extends IoTDevice {
    private boolean isOn;

    public SmartLight(String id, String name, boolean isOn) {
        super(id, name);
        this.isOn = isOn;
    }
    @Override
    public void performAction() {
        if (isOn) {
            System.out.printf("Turning off SmartLight %s\n", super.name);
            isOn = false;
        } else {
            System.out.printf("Turning on SmartLight %s\n", super.name);
            isOn = true;
        }
    }
}
