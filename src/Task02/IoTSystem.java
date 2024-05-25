package Task02;

public class IoTSystem {
    public static void main(String[] args) {
        SmartLight alisa = new SmartLight("1", "Alisa", true);
        SmartThermostat elon = new SmartThermostat("2", "Elon", 22);
        alisa.performAction();
        elon.performAction();
        elon.setTemperature(25);
        elon.performAction();
    }
}
