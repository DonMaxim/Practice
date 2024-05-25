package Task02;

public class SmartThermostat extends IoTDevice {
    private int temperature;

    public SmartThermostat(String id, String name, int temperature) {
        super(id, name);
        this.temperature = temperature;
    }

    @Override
    public void performAction() {
        System.out.printf("Temperature is %d on SmartTermostat %s\n", temperature, super.name);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
