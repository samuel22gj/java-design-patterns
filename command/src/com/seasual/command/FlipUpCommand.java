package com.seasual.command;

/**
 * The Command for turning on the light - ConcreteCommand #1.
 */
public class FlipUpCommand implements Command {
    private Light light;

    public FlipUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        System.out.print("[Undo] ");
        light.turnOff();
    }
}
