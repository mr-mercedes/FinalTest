package org.example;

public class Command {
    private String command;
    private String action;

    public Command(String command, String action) {
        this.command = command;
        this.action = action;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Command{" +
                "command='" + command + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
