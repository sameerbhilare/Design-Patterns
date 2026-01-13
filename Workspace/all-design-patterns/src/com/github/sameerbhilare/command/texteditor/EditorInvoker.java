package com.github.sameerbhilare.command.texteditor;

import java.util.Stack;

// Invoker
public class EditorInvoker {

    Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if(!history.isEmpty()) {
            history.pop().undo();
        }
    }
}
