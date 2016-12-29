package com.seasual.command;

public class CommandApp {

    public static void main(String[] args) {
        Light light = new Light();
        Housekeeper housekeeper = new Housekeeper();

        Command switchUp = new FlipUpCommand(light);
        Command switchDown = new FlipDownCommand(light);

        housekeeper.addCommand(switchUp); // will be removed
        housekeeper.addCommand(switchDown);
        housekeeper.addCommand(new FlipUpCommand(light));
        housekeeper.addCommand(new FlipDownCommand(light));
        housekeeper.addCommand(new FlipUpCommand(light));

        housekeeper.removeCommand(switchUp);
        housekeeper.executeCommand();
        housekeeper.undoCommand();
        housekeeper.undoCommand();
        housekeeper.undoCommand();
        housekeeper.undoCommand();
        housekeeper.undoCommand();
    }
}
