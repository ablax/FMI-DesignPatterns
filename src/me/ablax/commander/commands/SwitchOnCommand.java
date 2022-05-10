package me.ablax.commander.commands;

import me.ablax.commander.Lights;
import me.ablax.commander.interfaces.Command;

public class SwitchOnCommand implements Command {

    private final Lights lights;

    public SwitchOnCommand(final Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.switchOn();
    }

    @Override
    public void undo() {
        lights.switchOff();
    }
}
