package Part2;

public class Thermostat {
    private int previousTemperature;

    public void setTemperature(int temperature) {
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
        this.previousTemperature = temperature;
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature " + previousTemperature + "°C");
    }
}
