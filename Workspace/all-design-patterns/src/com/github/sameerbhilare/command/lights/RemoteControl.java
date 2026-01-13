package com.github.sameerbhilare.command.lights;

import java.util.Stack;

// Invoker with undo support
public class RemoteControl {

    Stack<Command> history = new Stack<>();

    public void pressButton(Command command) {
        command.execute();
        history.push(command);
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
    }
}
