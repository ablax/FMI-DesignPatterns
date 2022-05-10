package me.ablax.commander;

import me.ablax.commander.interfaces.Command;

public class RemoteController {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(final Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (this.command == null) {
            System.out.println("No commands set");
            return;
        }
        this.command.execute();
    }

    public void pressUndoButton() {
        if (this.command == null) {
            System.out.println("No command set");
            return;
        }
        this.command.undo();
    }
}
