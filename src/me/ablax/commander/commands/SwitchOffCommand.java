package me.ablax.commander.commands;

import me.ablax.commander.Lights;
import me.ablax.commander.interfaces.Command;

public class SwitchOffCommand implements Command {

    private final Lights lights;

    public SwitchOffCommand(final Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.switchOff();
    }

    @Override
    public void undo() {
        lights.switchOn();
    }
}
