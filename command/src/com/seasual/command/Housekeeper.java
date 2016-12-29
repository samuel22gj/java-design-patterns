package com.seasual.command;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * The Invoker class
 */
public class Housekeeper {
    private Queue<Command> executeStack = new LinkedList<>();
    private Deque<Command> undoStack = new LinkedList<>();

    public void addCommand(Command cmd) {
        executeStack.offer(cmd);
    }

    public void removeCommand(Command cmd) {
        executeStack.remove(cmd);
    }

    public void executeCommand() {
        while (!executeStack.isEmpty()) {
            Command cmd = executeStack.poll();
            cmd.execute();
            undoStack.offerLast(cmd);
        }
    }

    public void undoCommand() {
        if (!undoStack.isEmpty()) {
            Command cmd = undoStack.pollLast();
            cmd.undo();
        } else {
            System.out.println("Undo stack is empty!");
        }
    }
}
