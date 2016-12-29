package com.seasual.command;

/**
 * The Command for turning off the light - ConcreteCommand #2.
 */
public class FlipDownCommand implements Command {
    private Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        System.out.print("[Undo] ");
        light.turnOn();
    }
}
