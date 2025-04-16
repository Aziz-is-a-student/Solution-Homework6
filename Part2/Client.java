package Part2;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command turnOnLightCommand = new TurnOnLightCommand(light);
        Command setThermostatCommand = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();

        remote.addCommand("light", turnOnLightCommand);
        remote.addCommand("thermostat", setThermostatCommand);

        remote.pressButton("light");
        remote.pressButton("thermostat");

        System.out.println("Undo last command");
        remote.undoButton("thermostat");
    }
}
