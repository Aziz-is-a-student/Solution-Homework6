package Part2;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl {
    private Map<String, Command> commands = new HashMap<>();

    public void addCommand(String slot, Command command) {
        commands.put(slot, command);
    }

    public void pressButton(String slot) {
        if (commands.containsKey(slot)) {
            commands.get(slot).execute();
        }
    }

    public void undoButton(String slot) {
        if (commands.containsKey(slot)) {
            commands.get(slot).undo();
        }
    }
}
